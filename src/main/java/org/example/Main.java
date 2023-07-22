package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ListOfTargets target = new ListOfTargets();
        ListOfRockets rocket = new ListOfRockets();

        boolean wePlay = true;
        do {
            System.out.println("(1) List of targets");
            System.out.println("(2) List of rockets");
            System.out.println("(3) Choose a target to attack");
            System.out.println("(4) Exit");

            switch (getInt()) {
                case (1):
                    target.ListOfAllTargets();
                    break;
                case (2):
                    rocket.ListOfAllRockets();
                    break;
                case (3):
                    System.out.println("Choose id of a target:");
                    target.ListOfAllTargets();
                    int playersChoiceTarget = getInt() - 1;

                    if (playersChoiceTarget >= 0 && playersChoiceTarget <= target.lengthOfTargetList()) {
                        boolean rocketChoice = true;
                        do {
                            System.out.println("Which rocket would you like to launch?");
                            rocket.ListOfAllRockets();
                            int playersChoiceRocket = getInt() - 1;
                            if (rocket.RocketRange(playersChoiceRocket) >= target.TargetDistance(playersChoiceTarget)) {
                                System.out.println("The target is in range of the chosen rocket.");

                                // tu dodac ProbabilityOfHit

                                target.ListOfTargetsUpdate(playersChoiceTarget,20);
                                System.out.println("Chosen rocket was launched and hit the target!\n" +
                                        "Current state of the target: " + target.targetList.get(playersChoiceTarget));
                                rocketChoice = false;
                            }
                            if (rocket.RocketRange(playersChoiceRocket) < target.TargetDistance(playersChoiceRocket)){
                                System.out.println("The target is out of range of chosen rocket. Try again.");
                                System.out.println();
                            }
                        } while (rocketChoice);
                    } else {
                        System.out.println("Choose between 1 and 5.");
                    }
                    break;
                case (4):
                    wePlay = false;
            }
            System.out.println();
        }
        while (wePlay);
    }

    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }
}