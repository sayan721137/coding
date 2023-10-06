import java.util.*;

class removevowels {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The String:");
        String co = sc.next();
        int n = co.length();
        
        for (int i = 0; i < n; i++) {

            if(co.charAt(i)=='a'|| co.charAt(i)=='e'|| co.charAt(i)=='i'|| co.charAt(i)=='o'|| co.charAt(i)=='u'){
                continue;

            }
            else{
                System.out.print(co.charAt(i));
            }


        }

    }
}
