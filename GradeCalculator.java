import java.util.*;
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Java Marks Out of 100 : ");
        int javaM = sc.nextInt();
        System.out.print("Enter Your C++ Marks Out of 100 : ");
        int cppM = sc.nextInt();
        System.out.print("Enter Your Python Marks Out of 100 : ");
        int pythonM = sc.nextInt();
        System.out.print("Enter Your DBMS Marks Out of 100 : ");
        int dbmsM = sc.nextInt();
        System.out.print("Enter Your Networking Marks Out of 100 : ");
        int networkM = sc.nextInt();

        int totalMarks = javaM + cppM + pythonM + dbmsM + networkM;
        double pec = (double)totalMarks/5;
        System.out.println("*************************************************************");
        System.out.println("Result");
        System.out.println("*************************************************************");
        System.out.println("Java       -> Marks : "+javaM+"  | Grade : "+ grade(javaM));
        System.out.println("C++        -> Marks : "+cppM+"  | Grade : "+ grade(cppM));
        System.out.println("Python     -> Marks : "+pythonM+"  | Grade : "+ grade(pythonM));
        System.out.println("DBMS       -> Marks : "+dbmsM+"  | Grade : "+ grade(dbmsM));
        System.out.println("Networking -> Marks : "+networkM+"  | Grade : "+ grade(networkM));
        System.out.println("*************************************************************");
        System.out.println("Total Marks : "+totalMarks);
        System.out.println("Average Percentage : "+pec+"%");
        System.out.println("Overall Grade : "+grade(totalMarks));

    }
    public static String grade(int number)
    {
        if(number > 90)
            return "S";
        else if (number > 80) 
            return "A";
        else if(number > 70)
            return "B";
        else if(number > 60)
            return "C";
        else if(number > 50)
            return "D";
        else if(number > 40)
            return "E";
        else
            return "F";
    }
}
