import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Salary = 5000000;
        
        System.out.println("Choose 1 : ");
        System.out.println("1.Student\n2. Teacher");
        String pilihan = input.nextLine();

        if (pilihan.equalsIgnoreCase("1")) {
            System.out.println("Student Details: ");
            System.out.println("Name: ");
            String Name = input.nextLine();
            System.out.println("major :");
            String major = input.nextLine();
            System.out.println("Age: ");
            int age = input.nextInt();
            input.nextLine();
            System.out.println("Student number: ");
            int studentNumber = input.nextInt();
            input.nextLine();
            System.out.println("Score: ");
            int Score = input.nextInt();
            Student student = new Student(Name, age, major, Score, studentNumber);
            student.print();
        } else if (pilihan.equalsIgnoreCase("2")) {
            System.out.println("Choose 2 : ");
            System.out.println("1. Part Time\n2. 2. Full Time");
            String pilihan2 = input.nextLine();
            if (pilihan2.equalsIgnoreCase("1")) {
                System.out.println("Part Time Detail : ");
                System.out.println("Name : ");
                String name = input.nextLine();
                System.out.println("Subject : ");
                String Subject = input.nextLine();
                System.out.println("Age : ");
                int Age = input.nextInt();
                input.nextLine();
                System.out.println("Hours worked : ");
                int HoursWorked = input.nextInt();
                input.nextLine();
                input.nextLine();
                PartTime partTime = new PartTime(name, Age, Subject, HoursWorked, Salary);
                partTime.print();
            }

            if (pilihan2.equalsIgnoreCase("2")) {
                System.out.println("Full Time Detail : ");
                System.out.println("Name : ");
                String name = input.nextLine();

                System.out.println("Subject : ");
                String Subject = input.nextLine();
                
                System.out.println("Unit : ");
                String Unit = input.nextLine();

                System.out.println("Age : ");
                int Age = input.nextInt();
                
                System.out.println("Annual Salary  ");
                int AnnualSalary = input.nextInt();
                
                FullTime fullTime = new FullTime(name, Age,  Subject, Unit, AnnualSalary);
                fullTime.print();
            } else {
        }

    }
}
}
