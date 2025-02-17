import java.util.*;
public class AbundantNumberL3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }

        if(sum > num){
            System.out.println(num+" is an Abundant Number");
        } 
        else{
            System.out.println(num+" is NOT an Abundant Number");
        }

        sc.close();
    }
}
