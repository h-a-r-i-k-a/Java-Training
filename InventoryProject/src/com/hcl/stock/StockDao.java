package com.hcl.stock;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;





public class StockDao {
	Connection connection;
	PreparedStatement pst;
	
	public  int generateOrderId(){
		connection=DaoConnection.getConnection();
		String cmd=" Select CASE WHEN MAX(orderid) IS NULL THEN 1 "+ " ELSE MAX(orderid)+1 END orderid from Orders";
		int orderid=0;
		try {
		pst=connection.prepareStatement(cmd);
		ResultSet rs=pst.executeQuery();
		rs.next();
		orderid=rs.getInt("orderid");
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		return orderid;
		}
	
	public String placeOrder(String stockId, int qtyord){
		connection=DaoConnection.getConnection();
		String result="";
		String cmd;
		double bill=0;
		double amt=0;
		Stock stock=searchStock(stockId);
		StockDao dao=new StockDao();
		if(stockId!=null){
			int QuantityAvail=stock.getQuantityAvail();
			if(QuantityAvail-qtyord>0){
				 cmd=" update stock set QuantityAvail=QuantityAvail-? "+" where stockId=? ";
				
				try {
					pst=connection.prepareStatement(cmd);
					pst.setInt(1, qtyord);
					pst.setString(2, stockId);
					pst.executeUpdate();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				cmd=" Insert into Orders(OrderId,StockID, QtyOrd,billAmt) "+" values(?,?,?,?)";
				try {
					pst=connection.prepareStatement(cmd);
					pst.setInt(1,dao.generateOrderId());
					pst.setString(2, stockId);
					pst.setInt(3,qtyord);
					 bill=stock.getPrice()*qtyord;
					pst.setDouble(4,bill);
					pst.executeUpdate();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				result="order placed sucessfully";
			}
		
			else{
				System.out.println("no avail qty");
			}
		}
			else{
				System.out.println("wrong id");
			}
		cmd=" Insert into Amount(Gamt) "+" values(?)";
		try {
			pst=connection.prepareStatement(cmd);
			 amt=amt+bill;
			 pst.setDouble(1,amt);
			 pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return result;
	}
	
	public String updateStock(String stockid,Double Price,int QuantityAvail){
		connection=DaoConnection.getConnection();
		String result="";
		String cmd=" update Stock set price=?, QuantityAvail=?" + "where Stockid=? ";
		try {
			pst=connection.prepareStatement(cmd);
			pst.setDouble(1, Price);
			pst.setInt(2, QuantityAvail);
			pst.executeUpdate();
			result="stock updated...";
						
		} catch (SQLException e) {
			result=e.getMessage();
			e.printStackTrace();
		}
		return result;
		
		
	}
	
	public Stock searchStock(String Stockid){
		connection=DaoConnection.getConnection();
		String cmd=" select * from Stock where Stockid=? ";
		Stock stock=null;
		try {
			pst=connection.prepareStatement(cmd);
			pst.setString(1, Stockid);
			ResultSet rs=pst.executeQuery();
			if(rs.next()){
				stock=new Stock();
				stock.setItemName(rs.getString("itemName"));
				stock.setPrice(rs.getDouble("Price"));
				stock.setQuantityAvail(rs.getInt("QuantityAvail"));
															
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return stock;
	}
	
	public String createStock(Stock stock){
		connection=DaoConnection.getConnection();
		String cmd=" insert into Stock(Stockid,itemName, "+" Price,QuantityAvail) values(?,?,?,?)" ;
		String result="";
		try {
			pst=connection.prepareStatement(cmd);
			pst.setString(1, stock.getStockid());
			pst.setString(2, stock.getItemName());
			pst.setDouble(3, stock.getPrice());
			pst.setInt(4, stock.getQuantityAvail());
			pst.executeUpdate();
			result="Stock created successfully..."+stock.getStockid();
									
		} catch (SQLException e) {
			result=e.getMessage();
			e.printStackTrace();
		}
		return result;
	}
	
	public String generateStockid() {
		connection=DaoConnection.getConnection();
		String cmd="select CASE WHEN MAX(Stockid) IS NULL THEN 'S000' "
				+" ELSE MAX(Stockid) END Stockid from Stock";
		String Stockid="";
		try {
			pst=connection.prepareStatement(cmd);
			ResultSet rs=pst.executeQuery();
			rs.next();
			Stockid=rs.getString("Stockid");
			int sid=Integer.parseInt(Stockid.substring(1));
			sid++;
			if(sid>=1 && sid<=9){
				Stockid="S00"+sid;
			}
			if(sid>=10 && sid<=99){
				Stockid="S00"+sid;
			}
			if(sid>=100 && sid<=999){
				Stockid="S00"+sid;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Stockid;
	}

	
	public List<Stock> showStock(){
		connection=DaoConnection.getConnection();
		String cmd=" select * from Stock ";
		Stock stock=null;
		List<Stock> stockList=new ArrayList<>();
		try {
			pst=connection.prepareStatement(cmd);
			ResultSet rs=pst.executeQuery();
			while(rs.next()){
				stock=new Stock();
				stock.setStockid(rs.getString("stockid"));
				stock.setItemName(rs.getString("itemName"));
				stock.setPrice(rs.getDouble("price"));
				stock.setQuantityAvail(rs.getInt("QuantityAvail"));
				}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stockList;
		}

}
