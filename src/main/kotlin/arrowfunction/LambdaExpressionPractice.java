package arrowfunction;

public class LambdaExpressionPractice
{
    public static void main(String[] args)
    {
        //  Lambda Expression
        LambdaInterface impl = (n) -> (n + 3) == 0;
        System.out.println(impl.fun(-3));


        //  Block Lambda
        LambdaInterface2 impl2 = (n) ->
        {
            int a = 1;

            for(int i = 1; i <= n; i++)
            {
                a = i + a;
            }
            return a;
        };

        System.out.println(impl2.fun(10));

        //  Runnable Example
        Runnable runnable = () -> System.out.println("Hello, lambda");
        runnable.run();

        LambdaInterface3 impl3 = (s) -> s + "world";
        LambdaInterface3 impl4 = (s) -> s + "boy";
        print("hello", impl3);
        print("banana", impl4);

        //  Bad Case
        // LambdaInterface4 impl5 = () -> System.out.println("hello");
    }
    public static void print(String word, LambdaInterface3 impl)
    {
        String result = impl.fun(word);
        System.out.println(result);
    }
}
