import java.util.*;
public class two {

    static int miss_no(int n,int arr[]){


        int sum=((n+1)*(n+2))/2;



        for(int i=0;i<n;i++){
            sum=sum-arr[i];
        }
        return sum;

        }
        //System.out.println(rev);


    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("REMINDER, It Can't Find Two Number, Only Find Single number......\n");
        System.out.print("Enter The Size Of Array:");

        int i=sc.nextInt();
        int[] arr=new int[i];
        for(int j=0;j<i;j++) {
            System.out.print("Enter The Number:");
            arr[j]=sc.nextInt();


        }
        System.out.println(miss_no(i,arr));

    }
}
