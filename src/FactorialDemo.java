public class FactorialDemo {
    /*  5! => 5 x 4!
        5 x 4! => 5 x 4 x 3!
        => 5 x 4 x 3 x 2!
        => 5 x 4 x 3 x 2 x 1!
        => 5 x 4 x 3 x 2 x 1 x 0!
        since 0! = 1
        => 5 x 4 x 3 x 2 x 1 x 1
     */
    public int factorial(int number){
        //base condition or stopping condition
        //base case
        if(number == 0){
            return 1;
        }
        int result  = number * factorial(number - 1);
        return result;
    }

    public static void main(String[] args) {
        FactorialDemo factorialDemo = new FactorialDemo();
        int number = 5;
        int result = factorialDemo.factorial(number);
        System.out.println("result = " + result);
    }
}
