package org.example;

public class Main {
    public static void main(String[] args) {

        ListOfTargets target = new ListOfTargets();
        ListOfRockets rocket = new ListOfRockets();

        boolean wePlay = true;
        do {
            System.out.println("Choose action to do:");
            System.out.println("(1) List of targets");
            System.out.println("(2) List of rockets");
            System.out.println("(3) Choose a target to attack");
            System.out.println("(4) Exit");

            switch (GetInt.getInt()) {
                case (1):
                    target.listOfAllTargets();
                    break;
                case (2):
                    rocket.ListOfAllRockets();
                    break;
                case (3):
//                    new Attack();

                    System.out.println("Choose id of a target:");
                    target.listOfAllTargets();
                    int playersChoiceTarget = GetInt.getInt() - 1;

                    if (target.targetDamage(playersChoiceTarget) < 100) {
                        if (playersChoiceTarget >= 0 && playersChoiceTarget <= target.lengthOfTargetList()) {
                            boolean rocketChoice = true;
                            do {
                                System.out.println("Which rocket would you like to launch?");
                                rocket.ListOfAllRockets();
                                int playersChoiceRocket = GetInt.getInt() - 1;
                                if (rocket.RocketRange(playersChoiceRocket) < target.targetDistance(playersChoiceTarget)) {
                                    System.out.println("The target is out of range of chosen rocket. Try again.");
                                    System.out.println();
                                }
                                if (rocket.RocketRange(playersChoiceRocket) >= target.targetDistance(playersChoiceTarget)) {
                                    System.out.println("The target is in range of the chosen rocket.");

                                    ProbabilityOfHit probabilityOfHit = new ProbabilityOfHit();
                                    if (probabilityOfHit.ProbabilityOfHit(target.targetDistance(playersChoiceTarget), rocket.RocketRange(playersChoiceRocket))) {
                                        target.listOfTargetsUpdate(playersChoiceTarget, rocket.RocketCausingDamage(playersChoiceRocket));
                                        System.out.println("The chosen rocket was launched and hit the target!\n" +
                                                "Current state of the target: " + target.targetList.get(playersChoiceTarget));
                                    } else {
                                        System.out.println("The rocket missed the target...");
                                        System.out.println();
                                    }
                                    rocketChoice = false;
                                }
                            } while (rocketChoice);
                        } else {
                            System.out.println("Choose between 1 and 5.");
                        }
                    } else {
                        System.out.println(target.oneCityFromAList(playersChoiceTarget) + " is completely destroyed!");
                    }
                    break;
                case (4):
                    wePlay = false;
            }
            System.out.println();
        }
        while (wePlay);
    }
}