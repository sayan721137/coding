
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
class matrixaddition {
    static void find(int r,int c,int arr1[][],int arr2[][]){

        System.out.println("\nFirst Matrix...\n");
        for(int i=0;i<r;i++ ){
            for(int j=0;j<c;j++){
               // int sum=arr1[i][j]+arr2[i][j];
                System.out.print(arr1[i][j]+"\t");
            }
            System.out.println(" ");
        }
       System.out.println("\nSecond Matrix...\n");
        for(int i=0;i<r;i++ ){
            for(int j=0;j<c;j++){
                System.out.print(arr2[i][j]+"\t");
            }
            System.out.println(" ");
        }
        System.out.println("\nAddition Matrix...\n");
        for(int i=0;i<r;i++ ){
            for(int j=0;j<c;j++){
                int sum=arr1[i][j]+arr2[i][j];

                System.out.print(sum+"\t");
            }
            System.out.println(" ");
        }

    }


    public static void main(String[] arg){

        Scanner sc=new Scanner(System.in);
        System.out.println("\nREMINDER,Your can Enter the same Row's and Column's in Two Matrix For Addition of Two Matrix......");
        System.out.print("Enter Number Of Row's:");
        int r=sc.nextInt();

        System.out.print("Enter Number Of Column's:");
        int c=sc.nextInt();
        int[][] arr1 = new int[r][c];
        int[][] arr2 = new int[r][c];
        System.out.println("\nEnter The Value For First Matrix...................\n");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print("Enter The Next Column Value:");
                arr1[i][j]=sc.nextInt();
            }
            System.out.println("\n\t\t\t\t\tStarting Next Row");
        }

        System.out.println("\nEnter The Value For Second Matrix................\n");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print("Enter The Next Column Value:");
                arr2[i][j]=sc.nextInt();
            }
            System.out.println("\n\t\t\t\t\t\t\tStarting Next Row");
        }


        find(r,c,arr1,arr2);

    }
}
