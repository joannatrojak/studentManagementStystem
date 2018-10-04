package studentdatabaseapp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses;
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

    //View balance

    //Pay tuition

    //Show status
}
