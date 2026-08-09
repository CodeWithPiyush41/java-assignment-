
import java.io.*;

class Problem3 {
    public static void main(String arr[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter an integer: ");
        int num = Integer.parseInt(br.readLine());
        int ch;
        
        do {
            System.out.println("\n--- Number Analysis Menu ---");
            System.out.println("1. Check whether the number is Prime");
            System.out.println("2. Check whether it is Palindrome");
            System.out.println("3. Check whether it is Armstrong");
            System.out.println("4. Find the Sum of Digits");
            System.out.println("5. Reverse the Number");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            ch = Integer.parseInt(br.readLine());
            
            switch (ch) {
                case 1:
                    boolean isPrime = true;
                    if (num <= 1) {
                        isPrime = false;
                    } else {
                        for (int i = 2; i * i <= num; i++) {
                            if (num % i == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                    }
                    if (isPrime) {
                        System.out.println(num + " is a Prime number.");
                    } else {
                        System.out.println(num + " is NOT a Prime number.");
                    }
                    break;
                    
                case 2:
                    int tempPal = Math.abs(num);
                    int revPal = 0;
                    while (tempPal != 0) {
                        int r = tempPal % 10;
                        revPal = (revPal * 10) + r;
                        tempPal /= 10;
                    }
                    if (Math.abs(num) == revPal) {
                        System.out.println(num + " is a Palindrome.");
                    } else {
                        System.out.println(num + " is NOT a Palindrome.");
                    }
                    break;
                    
                case 3:
                    int tempArm = Math.abs(num);
                    int digits = 0;
                    int countTemp = tempArm;
                    while (countTemp != 0) {
                        countTemp /= 10;
                        digits++;
                    }
                    int sumArm = 0;
                    tempArm = Math.abs(num);
                    while (tempArm != 0) {
                        int rem = tempArm % 10;
                        sumArm += Math.pow(rem, digits);
                        tempArm /= 10;
                    }
                    if (Math.abs(num) == sumArm) {
                        System.out.println(num + " is an Armstrong number.");
                    } else {
                        System.out.println(num + " is NOT an Armstrong number.");
                    }
                    break;
                    
                case 4:
                    int tempSum = Math.abs(num);
                    int digitSum = 0;
                    while (tempSum != 0) {
                        digitSum += (tempSum % 10);
                        tempSum /= 10;
                    }
                    System.out.println("The sum of digits of " + num + " is: " + digitSum);
                    break;
                    
                case 5:
                    int tempRev = num;
                    int sign = tempRev < 0 ? -1 : 1;
                    tempRev = Math.abs(tempRev);
                    int reversed = 0;
                    while (tempRev != 0) {
                        int r = tempRev % 10;
                        reversed = (reversed * 10) + r;
                        tempRev /= 10;
                    }
                    System.out.println("The reverse of " + num + " is: " + (sign * reversed));
                    break;
                    
                case 6:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                    
                default:
                    System.out.println("Invalid choice! Please select between 1 and 6.");
                    break;
            }
        } while (ch != 6);
    }
}

