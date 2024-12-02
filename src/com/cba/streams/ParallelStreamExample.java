package com.cba.streams;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamExample {
    public static void main(String[] args) {
        System.out.println("Sum Sequential: " + sumSequentailStream());
        System.out.println("Sum Parallel: " + sumParallelStream());

        int loop = 2000;
        long resultofSequentialStream = measurePerformance(ParallelStreamExample::sumSequentailStream, loop);
        System.out.println("Time for sequential stream "+resultofSequentialStream);

        long resultofParallelStream = measurePerformance(ParallelStreamExample::sumParallelStream, loop);
        System.out.println("Time for parellel stream "+resultofParallelStream);
    }
    public static long measurePerformance (Supplier<Integer> supplier, int numberofTimes){
        long startTime = System.currentTimeMillis();
        for(int i=0; i<numberofTimes;i++){
            supplier.get();
        }
        return System.currentTimeMillis()-startTime;
    }


    private static int sumParallelStream() {
        return IntStream.rangeClosed(0,500000).parallel().sum();
    }

    private static int sumSequentailStream() {
        return IntStream.rangeClosed(0, 500000).sum();
    }
}
