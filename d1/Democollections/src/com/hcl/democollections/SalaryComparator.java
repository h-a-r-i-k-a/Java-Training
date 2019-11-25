package com.hcl.democollections;

import java.util.Comparator;

public class SalaryComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Employ e1=(Employ)o1;
        Employ e2=(Employ)o2;
        if(e1.salary>e2.salary){
            return 1;
        }else{
            return 0;
        }
    }

}
