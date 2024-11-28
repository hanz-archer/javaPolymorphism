import java.util.*;

public class Employee {
    public void InfoRegular(String name, int work, int workDays) {
        System.out.println("Name: "+ name);
        System.out.println("Work: "+ work);
        System.out.println("Your Daily Salary is 1,600 Pesos");
        System.out.println("Work Days: "+ workDays);
        int weeklySalary = 1600*workDays;
        System.out.println("The total Salary [Regular]: "+weeklySalary);
    }
    public void InfoPartTime(String name, int work,int workDays) {
        System.out.println("Name: "+ name);
        System.out.println("Work: "+ work);
        System.out.println("Your Daily Salary is 1,280 Pesos");
        System.out.println("Work Days: "+ workDays);
        int weeklySalary = 1280*workDays;
        System.out.println("The total Salary [Part-Time]: "+weeklySalary);
    }
}
class main{
    public static void main(String[] args) {
        Scanner scanme = new Scanner (System.in);
        System.out.println("Please Enter Worker's Name: ");
        String name = scanme.nextLine();
        System.out.println("How many days you work in a week");
        int workDays = scanme.nextInt();
        System.out.println("1. Regular");
        System.out.println("2. Part Timer");
        int work = scanme.nextInt();
        if(work == 1){
            Employee Hanz = new Employee();
            Hanz.InfoRegular(name,work, workDays);
        }
        if(work == 2){
            Employee Hanz = new Employee();
            Hanz.InfoPartTime(name, work,workDays);
        }
    }
}