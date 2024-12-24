import java.util.*;
public class any_base_subtraction{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number 2: ");
        int num2=in.nextInt();
        System.out.println("Enter Number 1: ");
        int num1=in.nextInt();
        System.out.println("Enter Base: ");
        int base=in.nextInt();
        int res=addition(num1, num2, base);
        System.out.println("Result: "+res);
    }
    public static int addition(int n1, int n2, int b)
    {
        int carry = 0, result = 0,c=0, digsum =0,digcnt=0;
        digcnt=count(n2);
        int f=0;
        for(int i=1;i<=digcnt;i++)
        {
            int dig1=extract(n1);
            int dig2=extract(n2);
            dig2+=carry;
            if (dig2<dig1)
            {
                dig2+= b;
                f=1;
            }
            else
            {
                f=0;
            }
            if(f==0)
            {
                carry=0;
            }
            else
            {
                carry=-1;
            }
            digsum = dig2 - dig1;
            // if(digsum>=b)
            // {
            //     digsum-=b;
            //     carry = 1;
            // }
            // else
            // {
            //     carry = 0;
            // }
            result+=digsum*(int)(Math.pow(10,c));
            c++;
            n1/=10;
            n2/=10;
            // dig2+=carry;
        }
        // result+=carry*(int)(Math.pow(10,c));

        return result;
    }
    public static int extract(int n)
    {
       int r=0;
       if(n>=0)
       {
           r=n%10;
           n/=10;
       }
       else
       {
        r=0;
       }
       return r;
    }
    public static int count(int n)
    {
        int count=0;
        while(n>0)
        {
            n/=10;
            count++;
        }
        return count;
    }
}
