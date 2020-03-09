package my.geeksforgeeks.problems;

import java.util.Scanner;

public class SubArrayWithGivenSum {

    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        //int totalNoOfTestCases = Integer.parseInt(in.nextLine());
        //for (int i = 1; i <= totalNoOfTestCases; i++) {
        //    String testCaseLine1 = in.nextLine();
        //    String[] nsdata = testCaseLine1.split(" ");
        //    int sizeOfArray = Integer.parseInt(nsdata[0]);
        //    int sumToCheck = Integer.parseInt(nsdata[1]);
        //    String testCaseLine2 = in.nextLine();
        //    String[] arraydata = testCaseLine2.split(" ");
        //}
        solution2();
    }
    static void solution1() {
        Scanner in = new Scanner(System.in);
        int totalNoOfTestCases = Integer.parseInt(in.nextLine());
        for (int i = 1; i <= totalNoOfTestCases; i++) {
            String testCaseLine1 = in.nextLine();
            String[] nsdata = testCaseLine1.split(" ");
            int sizeOfArray = Integer.parseInt(nsdata[0]);
            int sumToCheck = Integer.parseInt(nsdata[1]);
            String testCaseLine2 = in.nextLine();
            String[] arraydata = testCaseLine2.split(" ");
            boolean success = false;
            for (int j = 0; j < sizeOfArray; j++) {
                int sum = 0;
                for (int k = j; k < sizeOfArray; k++) {
                    //System.out.println("j = " + j + " and k = " + k) ;
                    sum += Integer.parseInt(arraydata[k]);
                    //System.out.println(sum);
                    if (sum == sumToCheck) {
                        System.out.println((j + 1) + " " + (k + 1));
                        success = true;
                        break;
                    } else if (sum > sumToCheck) {
                        break;
                    }
                }
                if (sum == sumToCheck) {
                    break;
                }
            }
            if (!success) {
                System.out.println("-1");
            }
        }
    }
    private static void solution2() {
        Scanner in = new Scanner(System.in);
        int totalNoOfTestCases = Integer.parseInt(in.nextLine());
        for (int i = 1; i <= totalNoOfTestCases; i++) {
            String testCaseLine1 = in.nextLine();
            String[] nsdata = testCaseLine1.split(" ");
            int sizeOfArray = Integer.parseInt(nsdata[0]);
            int sumToCheck = Integer.parseInt(nsdata[1]);
            String testCaseLine2 = in.nextLine();
            String[] arraydata = testCaseLine2.split(" ");
            int sum = Integer.parseInt(arraydata[0]), j=0;
            for (int k = 1; k <= sizeOfArray; k++) {
                 if (sum >sumToCheck) {
                    sum-=Integer.parseInt(arraydata[j]);
                    j+=1;
                }
                if(sum==sumToCheck){
                     System.out.println((j+1) + " " + (k));
                     return;
                }
                if(k<sizeOfArray) {
                    sum += Integer.parseInt(arraydata[k]);
                }
            }
            System.out.println("-1");
        }
    }
}
