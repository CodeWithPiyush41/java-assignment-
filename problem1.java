
import java.io.*;

class Problem1 {
    public static void main(String arr[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Marks scored in Maths out of 100 : ");
        int maths = Integer.parseInt(br.readLine());
        
        System.out.print("Marks scored in DSA out of 100 : ");
        int dsa = Integer.parseInt(br.readLine());
        
        System.out.print("Marks scored in JAVA out of 100 : ");
        int java = Integer.parseInt(br.readLine());
        
        System.out.print("Marks scored in Urdu out of 100 : ");
        int urdu = Integer.parseInt(br.readLine());
        
        System.out.print("Marks scored in ENG out of 100 : ");
        int eng = Integer.parseInt(br.readLine());
        
        int sum = maths + dsa + java + urdu + eng;
        System.out.println("Total marks obtained: " + sum + " / 500");
        
        double pers = (double) sum / 5.0;
        System.out.printf("Percentage obtained: %.2f%%\n", pers);
        
        if (pers >= 90) {
            System.out.println("Status: Passed and Scored Grade A+");
        } else if (pers >= 80) {
            System.out.println("Status: Passed and Scored Grade A");
        } else if (pers >= 70) {
            System.out.println("Status: Passed and Scored Grade B");
        } else if (pers >= 60) {
            System.out.println("Status: Passed and Scored Grade C");
        } else if (pers >= 50) {
            System.out.println("Status: Passed and Scored Grade D");
        } else {
            System.out.println("Status: Failed");
        }
    }
}
