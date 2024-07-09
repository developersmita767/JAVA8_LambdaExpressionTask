//Write a Java program to implement a lambda expression to find the sum of two integers.

package Java8_Task;
import java.util.function.BiFunction;


public class LambdaExpressionTask1 {
	/*public static void main(String[] args)
	{
		AddReturnFuncInterface addFun = (int a, int b) -> a+b;
		int res=addFun.add(30, 10);
		System.out.println("Sum="+res);
		
	}

}*/


    public static void main(String[] args) {
        
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

       
        int num1 = 10;
        int num2 = 20;
        int result = add.apply(num1, num2);

        // Print the result
        System.out.println("Result of adding  is: " + result);
    }
}
