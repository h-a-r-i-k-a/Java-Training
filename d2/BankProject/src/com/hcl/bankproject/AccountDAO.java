package com.hcl.bankproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountDAO {
	Connection connection;
	PreparedStatement pst;
	public int generateAccountNo(){
		connection=DaoConnection.getConnection();
		String cmd=" select case when max(accountNo) is NULL "
				+ " then 1 else Max(AccountNo)+1 end "
				+ " AccountNo from Accounts ";
		int accountNo=0;
		try {
			pst=connection.prepareStatement(cmd);
			ResultSet rs=pst.executeQuery();
			rs.next();
			accountNo=rs.getInt("AccountNo");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return accountNo;
	}

}
