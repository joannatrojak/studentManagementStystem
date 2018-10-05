package studentdatabaseapp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = null;
    private int tutionBalance;
    private static int costOfCourse = 600;
    private static int id = 1001;

    //Constructor - name and year

    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name:  ");
        this.firstName = in.nextLine();

        System.out.print("Enter student last name:  ");
        this.lastName = in.nextLine();

        System.out.print("1 - Freshmen\n2- Sophmore\n 3 - Junior\n 4 - Senior\nEnter student class level:  ");
        this.gradeYear = in.nextInt();

        setStudentId();
        System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);

    }
    //Generate id
    private void setStudentId(){
        //Grade Level +
        id++;
        this.studentID =  gradeYear + "" + id;
    }
    //Enroll in courses
    public void enroll(){
        do {
            System.out.println("Enter course to enrtoll (Q to quit");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")){
                courses = courses + "\n" + course;
                tutionBalance = tutionBalance + costOfCourse;
            }
            else{
                break;
            }
        }
        while (1 != 0);
        System.out.println("ENTROLLED IN: " + courses);
        System.out.println("TUTITIOn BALANCE: " + tutionBalance);

    }
    //View balance
    public void viewBalance(){
        System.out.println("Your balance is: "+ tutionBalance);
    }
    //Pay tuition
    public void payTuition(){
        System.out.println("Enter your payment: ");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tutionBalance = tutionBalance - payment;
        System.out.println("Thank you for your payment of " + payment);
        viewBalance();
    }
    //Show status
    public String toString(){
        return "Name: " + firstName + " " + lastName + "\nCourses Enrolled " + courses + "\nBalance: " + tutionBalance;
    }
}
