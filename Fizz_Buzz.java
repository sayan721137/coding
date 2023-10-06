//Print Number 1 to n, but replace multiples of 3 with "Fizz", multiples of 5 with "Buzz and multiples of both 3 and 5 with "FizzBuzz".
import java.util.*;
public class fizzbizz {
    static void save(int n){

        for(int i=1;i<=n;i++){
            if(i%3==0){
                if(i%5==0){
                    System.out.println(i +" = FizzBuzz");
                }
                else {
                    System.out.println(i+" = Fuzz");
                }
            }
            else if(i%5==0){
                if(i%3==0){
                    System.out.println(i+" = FizzBuzz");
                }
                else {
                    System.out.println(i+" = Buzz");
                }
            }

            else {
                System.out.println(i);
            }
        }

    }
    public static void main(String[] arg){
       Scanner sc=new Scanner(System.in);
        System.out.print("Enter maximum range of the Number:");
        int n=sc.nextInt();

        save(n);

        }

}
