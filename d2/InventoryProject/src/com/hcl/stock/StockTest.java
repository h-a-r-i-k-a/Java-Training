package com.hcl.stock;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;


public class StockTest {
    static Stock stock=null;
    @BeforeClass
    public static void setUp(){
        stock=new Stock();
    }

    @Test
    public void testGettersAndSetters() {
        stock=new Stock();
        stock.setStockid("S001");
        stock.setItemName("mobiles");
        stock.setPrice(5000);
        stock.setQuantityAvail(50);
        assertEquals("S001", stock.getStockid());
        assertEquals("mobiles", stock.getItemName());
        assertEquals(5000, stock.getPrice(),0);
        assertEquals(50, stock.getQuantityAvail());
       
    }

}
