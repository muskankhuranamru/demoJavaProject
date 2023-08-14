package main.java;


import io.github.pavelicii.allpairs4j.AllPairs;
import io.github.pavelicii.allpairs4j.Parameter;

import java.util.Arrays;

public class Main {
   
    public static void main(String[] args) {
       AllPairs allPairs = new AllPairs.AllPairsBuilder()
        .withParameters(Arrays.asList(
                new Parameter("Browser", "Chrome", "Safari", "Edge"),
                new Parameter("OS", "Windows", "Linux", "macOS"),
                new Parameter("RAM", 2048, 4096, 8192, 16384),
                new Parameter("Drive", "HDD", "SSD")))
        .build();

System.out.println(allPairs);
    }
}
