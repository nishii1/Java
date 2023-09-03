public class Calculator5 {
    public int addNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public int multiplyNumbers(int a, int b) {
        int product = a * b;
        return product;
    }

    public int divideNumbers(int a, int b) {
        if (b == 0) {
        }
        int quotient = a / b;
        return quotient;
    }

    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 15;
        Calculator5 obj = new Calculator5();
        int result = obj.addNumbers(num1, num2);
        System.out.println("Sum is: " + result);
        int productResult = obj.multiplyNumbers(num1, num2);
        System.out.println("Product is: " + productResult);
        int divisionResult = obj.divideNumbers(num1, num2);
        System.out.println("Quotient is: " + divisionResult);
    }
}