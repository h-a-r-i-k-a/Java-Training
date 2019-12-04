package com.hcl.bank;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class AccountTest {
    static Account account=null;
    @BeforeClass
    public static void setUp(){
        account=new Account();
    }

    @Test
    public void testGettersAndSetters() {
        
            account=new Account();
            account.setAccountNo(1);
            account.setFirstName("harika");
            account.setLastName("maddela");
            account.setCity("chennai");
            account.setState("tn");
            account.setAmout(77444);
            account.setCheqFacil("yes");
            account.setAccountType("savings");
            assertEquals(1, account.getAccountNo());
            assertEquals("harika", account.getFirstName());
            assertEquals("maddela", account.getLastName());
            assertEquals("chennai", account.getCity());
            assertEquals("tn", account.getState());
            assertEquals(77444, account.getAmout());
            assertEquals("yes", account.getCheqFacil());
            assertEquals("savings", account.getAccountType());
            
            
            
            
            
            
        }
    }


