package com.hcl.bank;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestDaoConnection {
    static  DaoConnection con=null;
   
  

    @Test
    public void testConnection() {
      
       
       
        assertNotNull(DaoConnection.getConnection());
        
       
    }
    
    

}
