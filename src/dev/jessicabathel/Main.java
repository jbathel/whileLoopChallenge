package dev.jessicabathel;

public class Main {

    public static void main(String[] args) {

        int number = 5;
        int finishNumber = 20;
        int evenNumbersFound = 0;
        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
            evenNumbersFound++;
            if (evenNumbersFound == 5) {
                break;
            }
        }
        System.out.println("Total even numbers found = " + evenNumbersFound);

        // Modify the while code above
        // Make it also record the total number of even numbers it has found
        // and break once 5 are found
        // and at the end, display the total number of even numbers found
    }

    // Create a method called isEvenNumber that takes a parameter of type int
    // Its purpose is to determine if the argument passed to the method is
    // an even number or not.
    // return true if an even number, otherwise return false;
    public static boolean isEvenNumber(int number) {
        return (number % 2) == 0;
    }
}
