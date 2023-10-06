import java.util.*;
import java.io.*;



class Main{
    static void reverse(String s){
        

        for (int j=s.length()-1;j>=0;j--){
            System.out.print(s.charAt(j));
        }
    }
    public static void main(String []argh)

    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The String:");
        String st=sc.nextLine();
        reverse(st);



    }
}



