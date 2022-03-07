import java.util.Scanner;

public class LowestJumps {
        public static int reachNumber(int target) {
            target = Math.abs(target);
            int k = 0;
            while (target > 0)
                //Subtracting ++k from target until it is not postive Integer
                target -= ++k;
            //if target is even then ans will be k, if not then ans will be k+1 or k+2
            return target % 2 == 0 ? k : k + 1 + k%2;
        }
        public static void main(String[]args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter The Target Integer");
            int target=sc.nextInt();
            System.out.println("The Minimum Jumps Required To Get From 0 to "+target+" is "+reachNumber(target));

        }
    }

