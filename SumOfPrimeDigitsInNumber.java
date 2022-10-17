import java.util.Scanner;
public class SumOfPrimeDigitsInNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n != 0) {
            int r = n % 10;
            if (isprime(r)) {
                sum += r;
            }
            n=n/10;

        }
        System.out.println(sum);
    }
    public static boolean isprime(int r)
    {
        int fact=0;
        for(int i=1;i<=r;i++)
        {
            if(r%i==0)
            {
                fact++;
            }
        }
        if(fact==2)
        {
            return true;
        }
        else {
            return false;
        }

    }
}
