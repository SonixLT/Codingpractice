public class Operations {
    public static void main(String[] args) {
        System.out.println(basicOp('+', 4, 7));
        System.out.println(basicOp('-', 15, 18));
        System.out.println(basicOp('*', 5, 5));
        System.out.println(basicOp('/', 49, 7));

    }

    private static Integer basicOp(char op, int num1, int num2) {
        switch (op) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/': {
                if (num2 == 0)
                    throw new IllegalArgumentException("Division by zero");
                return num1 / num2;
            }
            default:
                throw new IllegalStateException("Unexpected value: " + op);
        }
    }
}
