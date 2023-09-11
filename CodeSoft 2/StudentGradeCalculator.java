package Java_Internship;

import java.util.Scanner;

public class StudentGradeCalculator {


//
//        Scanner sc=new Scanner(System.in);
//        int English= sc.nextInt();
//
//        System.out.println("English = " + English);
//
//         int Hindi =sc.nextInt();
//        System.out.println("Hindi = " + Hindi);
//
//        int Math = sc.nextInt();
//        System.out.println("Math =" + Math);
//
//        int total=English+Hindi+Math;
//
//
public static void main(String[] args) {

        System.out.println("total number of subject");

        Scanner sc=new Scanner(System.in);
         int a=sc.nextInt();
         float total=0;
         int  x=0;

         for(int i=1;i<=a;i++)
         {
             Scanner s = new Scanner(System.in);
             float b= s.nextFloat();
             total=total+b;
             x=a*100;
         }

         float avgper=(total/x)*100;
         Math.round(avgper);

         String p;
         if(avgper>90 && avgper<100)
         {
             p = "A";
         }
         else if(avgper<90 && avgper>80)
         {
             p= " B";
         }
         else if(avgper<80 && avgper>70)
         {
              p=" C";
         }
         else if(avgper<70 && avgper>60)
         {
              p="D";
         }
         else
         {
             p="E";
         }

        System.out.println("The Total marks is "+ total +" Average Percentage is "+ avgper+ "%" +" Grade is "+p);

   }
}
