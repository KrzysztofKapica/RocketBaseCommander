package org.example;

import java.util.Random;

public class ProbabilityOfHit {
    public ProbabilityOfHit(int givenCityDistance, int givenRocketRange) {

        Random random = new Random();

        double result = (1 - ((double) givenCityDistance / (double) givenRocketRange)) * 100;
        int resultInt = (int) result;

        int randomNumber = random.nextInt(100);
        if (randomNumber <= resultInt) {
            System.out.println("The target is HIT!!!");
            // tu dodac target.ListOfTargetsUpdate(playersChoiceTarget,20) tutaj przy trafieniu zwiekszyc damage celu
        } else {
            System.out.println("The rocket missed the target...");
        }
    }
}
