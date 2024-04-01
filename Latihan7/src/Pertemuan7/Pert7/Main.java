package Pertemuan7.Pert7;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            numbers.add(i);
        }

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        Collections.sort(numbers);
        stopWatch.stop();

        System.out.println(stopWatch.getElapsedTime());
    }
}