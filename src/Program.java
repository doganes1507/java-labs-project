import java.util.ArrayList;

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

        for (int i = 1; i <= n; i++)
        {
            if (n % i == 0)
            {
                divisors.add(i);
            }
        }

        return divisors;
    }
}
