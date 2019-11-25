package com.hcl.collections;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateEx2 {
    public static void main(String[] args) {
        String doj="01/11/2019";
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date dt=sdf.parse(doj);
            System.out.println(dt);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
