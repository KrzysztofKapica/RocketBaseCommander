package org.example;

public class Attack {

    ListOfTargets target = new ListOfTargets();
    ListOfRockets rocket = new ListOfRockets();

    public void attackOnTargets() {
        boolean playersChoice = true;
        do {
            System.out.println("Choose id of a target:");
            target.listOfAllTargets();
            int playersChoiceTarget = GetInt.getInt() - 1;
            if (playersChoiceTarget > -1 && playersChoiceTarget < 6) {
                if (target.targetDamage(playersChoiceTarget) < 100) {
                    if (playersChoiceTarget <= target.lengthOfTargetList()) {
                        boolean rocketChoice = true;
                        do {
                            System.out.println("Which rocket would you like to launch?");
                            rocket.ListOfAllRockets();
                            int playersChoiceRocket = GetInt.getInt() - 1;
                            if (playersChoiceRocket > -1 && playersChoiceRocket <= rocket.lengthOfRocketList()) {
                                if (rocket.RocketRange(playersChoiceRocket) < target.targetDistance(playersChoiceTarget)) {
                                    System.out.println("The target is out of range of chosen rocket. Try again.\n");
                                }
                                if (rocket.RocketRange(playersChoiceRocket) >= target.targetDistance(playersChoiceTarget)) {
                                    System.out.println("The target is in range of the chosen rocket.");
                                    ProbabilityOfHit probabilityOfHit = new ProbabilityOfHit();
                                    if (probabilityOfHit.countProbabilityOfHit(target.targetDistance(playersChoiceTarget), rocket.RocketRange(playersChoiceRocket))) {
                                        target.listOfTargetsUpdate(playersChoiceTarget, rocket.RocketCausingDamage(playersChoiceRocket));
                                        System.out.println("The chosen rocket was launched and hit the target!\n" +
                                                "Current state of the target: " + target.oneCityFromAList(playersChoiceTarget));
                                    } else {
                                        System.out.println("The rocket missed the target...");
                                        System.out.println();
                                    }
                                    rocketChoice = false;
                                }
                            } else {
                                System.out.println("Wrong number! Choose between 1 and 3.\n");
                            }
                        } while (rocketChoice);
                        playersChoice = false;
                    }
                } else {
                    System.out.println(target.oneCityFromAList(playersChoiceTarget) + " is completely destroyed!\n");
                }
            } else {
                System.out.println("Wrong number! Choose between 1 and 5.\n");
            }
        } while (playersChoice);
    }

    public void listOfTargets() {
        target.listOfAllTargets();
    }

    public void listOfRockets() {
        rocket.ListOfAllRockets();
    }
}