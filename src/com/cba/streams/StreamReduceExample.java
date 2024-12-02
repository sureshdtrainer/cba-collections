package com.cba.streams;

import java.util.Arrays;
import java.util.List;

public class StreamReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

        int results = numbers.stream()
                //0+1 = 1   //10+5=15
                //1+2=3    //15+6=21
                //3+3=6    //21+7 = 28
                //6+4=10  //28+8 =36 //36+9=45
                .reduce(0,(a,b) -> a+b);
        System.out.println(results);
    }
}
