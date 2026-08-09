
import java.io.*;

class Problem4 {
    public static void main(String arr[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int s[] = new int[10];
        
        System.out.println("Enter 10 Elements of Array:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter Element " + (i + 1) + ": ");
            s[i] = Integer.parseInt(br.readLine());
        }
 
        int max = s[0];
        int min = s[0];
        int sum = 0;
        int evenCount = 0;
        int oddCount = 0;
        
        for (int i = 0; i < 10; i++) {
            if (s[i] > max) {
                max = s[i];
            }
            if (s[i] < min) {
                min = s[i];
            }
            sum += s[i];
            
            if (s[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        double avg = (double) sum / 10.0;
        
        System.out.println("\n--- Array Statistics Summary ---");
        System.out.println("Maximum Element : " + max);
        System.out.println("Minimum Element : " + min);
        System.out.printf("Average         : %.2f\n", avg);
        System.out.println("Even Count      : " + evenCount);
        System.out.println("Odd Count       : " + oddCount);
        
        System.out.print("\nEnter the number you want to search: ");
        int k = Integer.parseInt(br.readLine());
        
        int foundIndex = -1;
        for (int i = 0; i < 10; i++) {
            if (s[i] == k) {
                foundIndex = i;
                break;
            }
        }
        
        if (foundIndex != -1) {
            System.out.println("Result: Number " + k + " FOUND in the array at index " + foundIndex + " (Position " + (foundIndex + 1) + ").");
        } else {
            System.out.println("Result: Number " + k + " NOT FOUND in the array.");
        }
        
        System.out.print("\nArray elements in reverse order: ");
        for (int i = 9; i >= 0; i--) {
            System.out.print(s[i] + " ");
        }
        System.out.println();
    }
}

