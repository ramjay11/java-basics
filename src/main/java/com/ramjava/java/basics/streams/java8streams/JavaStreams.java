package com.ramjava.java.basics.streams.java8streams;

import java.io.IOException;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*Streams bring functional programming to Java, and are supported starting Java 8*/
public class JavaStreams {
    public static void main(String[] args) throws IOException {
        //1. Integer Stream
        IntStream
                .range(1, 10) // 1 to 9 since 10 is non-inclusive
                .forEach(System.out::print); // terminal operation
        System.out.println();
        //2. Integer Stream with skip
        IntStream
                .range(1, 10) // 1 to 9 since 10 is non-inclusive
                .skip(5) // skip the first 5 elements of the stream
                //lambda expression. x is the parameter that is passed to the forEach func which is an int
                .forEach(x -> System.out.println(x));
        System.out.println();
        //3. Integer Stream with sum
        System.out.println(
                IntStream
                        .range(1, 5) // add from 1 thru 5
                        .sum());
        System.out.println();
        //4. Streams.of, sorted and findFirst
        Stream.of("Ava", "Aneri", "Java")//Pass argument String names
                .sorted() //Sort it
                .findFirst() //
                .ifPresent(System.out::println);
        System.out.println();
        //5. Stream from Array, sort, filter and print
        String[] names = {"Diane", "Joane", "Maye", "Jean"};
        Arrays.stream(names) //Same as Stream.of(names)
                .filter(x -> x.startsWith("J"))
                .sorted()
                .forEach(System.out::println);
    }
}
