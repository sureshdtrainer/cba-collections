package com.cba.iterator;

// Java code to illustrate
// Fail Safe Iterator in Java
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Iterator;

class FailSafeItr {
    public static void main(String args[])
    {
        CopyOnWriteArrayList<Integer> list
                = new CopyOnWriteArrayList<Integer>(new Integer[] { 1, 3, 5, 8 });
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            Integer no = (Integer)itr.next();
            System.out.println(no);
            if (no == 8)

                // This will not print,
                // hence it has created separate copy
                list.add(14);
        }
    }
}

