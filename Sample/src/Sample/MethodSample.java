package Sample; 

public class MethodSample { 

    public static void main(String[] args) { 
        int number1 = 100; 
        int number2 = 10; 
        sumMethod1(number1, number2); 
        // ----- 追記（ここから）----
        int result2 = sumMethod2(number1, number2); 
        System.out.println("sumMethod2の結果は" + result2); 
        // ----- 追記（ここまで）----
        } 
        public static void sumMethod1(int num1, int num2) { 
        int result = num1 + num2; 
        System.out.println("sumMethod1の結果は" + result); 
        } 
        // ----- 追記（ここから）----
        public static int sumMethod2(int num1, int num2) { 
        int result = num1 + num2; 
        return result; 
} 
// ----- 追記（ここまで）----
}