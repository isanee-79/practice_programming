package day5_tasks;

public class Employee {
    public static void main(String[] args) {

        //declare the variables
        String firstName = "daniel";
        String lastName = "Perez";
        String companyName = "Target";
        int salary = 51000;
        int startDay = 7;
        int startMonth = 6;
        int startYear = 2021;
        boolean areTheyFullTime = true;
        String jobTitle = "manager";
        String officeAddress = "3559 Boston Street,Baltimore,MD";
        int baseSalary = 11000;
        String salaryAfter3Years = "$" + (baseSalary + baseSalary);

        //assigning
        System.out.println("Employee Information: \n");
        System.out.println("Full Name:            " + firstName + " " + lastName );
        System.out.println("Full Start Date:      " + startMonth + "/" + startDay + "/" + startYear );
        System.out.println("Email:                " + firstName + startDay + "@" + companyName + ".com" );
        System.out.println("Salary After 3 Years: " + salaryAfter3Years );


    }
}
