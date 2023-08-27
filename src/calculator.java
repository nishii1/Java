public class calculator {
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
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        int quotient = a / b;
        return quotient;
    }
    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 15;
        calculator obj = new calculator();
        int result = obj.addNumbers(num1, num2);
        System.out.println("Sum is: " + result);

        int productResult = obj.multiplyNumbers(num1, num2);
        System.out.println("Product is: " + productResult);

        int divisionResult = obj.divideNumbers(num1, num2);
        System.out.println("Quotient is: " + divisionResult);
    }
}