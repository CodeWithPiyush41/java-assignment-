import java.io.*;

class Problem2 {
    public static void main(String arr[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter Consumer Name: ");
        String name = br.readLine();
        
        System.out.print("Enter Consumer Number: ");
        int conNo = Integer.parseInt(br.readLine());
        
        System.out.print("Enter Units Consumed: ");
        int units = Integer.parseInt(br.readLine());
        
        double bill = 0;
        
        if (units <= 100) {
            bill = units * 3;
        } else if (units <= 200) {
            bill = (100 * 3) + (units - 100) * 5;
        } else if (units <= 500) {
            bill = (100 * 3) + (100 * 5) + (units - 200) * 7;
        } else {
            bill = (100 * 3) + (100 * 5) + (300 * 7) + (units - 500) * 10;
        }
        
        System.out.println("\n--- Electricity Bill ---");
        System.out.println("Consumer Name   : " + name);
        System.out.println("Consumer Number : " + conNo);
        System.out.println("Units Consumed  : " + units);
        System.out.printf("Base Bill Amount: ₹%.2f\n", bill);
        
        if (bill > 5000) {
            double surcharge = bill * 0.05;
            double totalBill = bill + surcharge;
            System.out.printf("Surcharge (5%%)  : ₹%.2f\n", surcharge);
            System.out.printf("Total Bill Amount (Including Surcharge): ₹%.2f\n", totalBill);
        } else {
            System.out.printf("Total Bill Amount (Without Surcharge)  : ₹%.2f\n", bill);
        }
    }
}
