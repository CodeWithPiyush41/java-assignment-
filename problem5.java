

import java.io.*;

class Employee {
    int empid;
    double bsal;
    double DA, HRA, PF, Gsal, Nsal;
    String name;
    
    void read(BufferedReader br, int index) throws IOException {
        System.out.println("\n--- Entering Details for Employee " + (index + 1) + " ---");
        System.out.print("Enter Employee ID: ");
        empid = Integer.parseInt(br.readLine());
        
        System.out.print("Enter Employee Name: ");
        name = br.readLine();
        
        System.out.print("Enter Basic Salary: ");
        bsal = Double.parseDouble(br.readLine());
        
        
        DA = bsal * 0.40;  
        HRA = bsal * 0.20;  
        PF = bsal * 0.12;   
        Gsal = bsal + DA + HRA; 
        Nsal = Gsal - PF;     
    }
    
    void showRow() {
        System.out.printf("%-8d %-15s %-12.2f %-10.2f %-10.2f %-10.2f %-12.2f %-12.2f\n",
                empid, name, bsal, DA, HRA, PF, Gsal, Nsal);
    }
}

class Problem5 {
    public static void main(String arr[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Number of records to enter? : ");
        int n = Integer.parseInt(br.readLine());
        
        if (n <= 0) {
            System.out.println("Invalid number of records!");
            return;
        }
        
        Employee e[] = new Employee[n];
        for (int i = 0; i < n; i++) {
            e[i] = new Employee();
            e[i].read(br, i);
        }
        
        System.out.println("\n=========================================================================================================");
        System.out.printf("%-8s %-15s %-12s %-10s %-10s %-10s %-12s %-12s\n",
                "ID", "Name", "Basic Sal", "DA (40%)", "HRA (20%)", "PF (12%)", "Gross Sal", "Net Sal");
        System.out.println("=========================================================================================================");
        
        for (int i = 0; i < n; i++) {
            e[i].showRow();
        }
        System.out.println("=========================================================================================================");
        
        if (n == 1) {
            System.out.println("\nOnly one employee record entered:");
            System.out.printf("Highest, Lowest, and Average Basic Salary: ₹%.2f\n", e[0].bsal);
        } else {
            double maxS = e[0].bsal;
            double minS = e[0].bsal;
            int maxI = 0;
            int minI = 0;
            double totalBsal = 0;
            
            for (int i = 0; i < n; i++) {
                if (e[i].bsal > maxS) {
                    maxS = e[i].bsal;
                    maxI = i;
                }
                if (e[i].bsal < minS) {
                    minS = e[i].bsal;
                    minI = i;
                }
                totalBsal += e[i].bsal;
            }
            
            double avg = totalBsal / n;
            
            System.out.println("\n--- Salary Summary Statistics ---");
            System.out.printf("Highest Paid Employee: ID=%d, Name=%s, Basic Salary=₹%.2f, Net Salary=₹%.2f\n",
                    e[maxI].empid, e[maxI].name, e[maxI].bsal, e[maxI].Nsal);
            System.out.printf("Lowest Paid Employee : ID=%d, Name=%s, Basic Salary=₹%.2f, Net Salary=₹%.2f\n",
                    e[minI].empid, e[minI].name, e[minI].bsal, e[minI].Nsal);
            System.out.printf("Average Basic Salary of All Employees: ₹%.2f\n", avg);
        }
    }
}

