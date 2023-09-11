package Java_Internship;

import java.util.Random;
import java.util.Scanner;

public class Random1 {

    public static void main(String[] args) {

        Random r=new Random();
        int x= r.nextInt(100);
        System.out.println();

        User u=new User();
        u.Func(x);
    }
}
class User{

    void Func(int x) {

        for (int i = 0; i >= 0; i++) {

            Scanner sc = new Scanner(System.in);
            int  y = sc.nextInt();

            if (y > x) {
                System.out.println("Too High try again");
            } else if (y < x) {
                System.out.println("Too small try again");

            } else {
                System.out.println(" yes u guess a no");
                System.out.println();
                i = -2;
            }
        }

        System.out.println("You want to play again");
        System.out.println(" YES "  +   " NO ");
        Scanner s=new Scanner(System.in);
        String a=s.next();

         String c=a.toUpperCase();
        switch(c){

            case "YES":
            {
                System.out.println("play again");
                Random rr=new Random();
                Func( rr.nextInt(100));
                break;
            }
            case "NO":
            {
                System.out.println("EXIT");
                break;
            }
            default:
            {
                System.out.println("write in the correct formate");
            }
        }


    }

}