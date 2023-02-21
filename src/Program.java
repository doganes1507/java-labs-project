import java.util.ArrayList;
import java.util.Collections;

import static java.lang.Math.sqrt;

public class Program {
    public static void main(String[] args)
    {
        System.out.println("Hello World");
        System.out.println(multiply(15, 0.5));
        System.out.println(find_divisors(24));
    }

    public static double multiply(double a, double b)
    {
        return a * b;
    }

    public static ArrayList<Integer> find_divisors(double n)
    {
        var divisors = new ArrayList<Integer>();
        divisors.add(1);
        divisors.add((int) n);

        for (int i = 2; i <= sqrt(n); i++)
        {
            if (n % i == 0)
            {
                divisors.add(i);
                divisors.add((int) n / i);
            }
        }
        Collections.sort(divisors);
        return divisors;
    }
}
