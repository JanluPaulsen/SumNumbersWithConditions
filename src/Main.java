public class Main {
    public static void main(String[] args) {
        int countTracker = 0;
        int sumNumbers = 0;
        //for loop till i = 1000
        for (int i = 1; i <= 1000; i++) {
            //if the number is divided by 3 and 5 and is a whole number the conditions are met
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
                countTracker++;
                sumNumbers = sumNumbers + i;
                //if 5 numbers have been found end the loop and show the sum
                if (countTracker == 5) {
                    System.out.println(sumNumbers);
                    break;
                }
            }
        }
    }
}