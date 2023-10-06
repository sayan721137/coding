import java.util.*;




class prime{
    static void prime(int n){

        int m=0,i,flag=0;
        m=n/2;
        if(n==0||n==1){
            System.out.println(n+" is not a Prime Number.");
        }
        else{
            for(i=2;i<=m;i++){
                if(n%i==0){
                    System.out.println(n+" is not a Prime Number.");
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(n+" is a Prime Number.");
            }
        }

    }
    public static void main(String []argh)

    {

        Scanner sc= new Scanner(System.in);
        for(int i=0;i<5;i++) {
            System.out.println("Enter The Number:");
            int st = sc.nextInt();
            prime(st);
        }


    }
}



