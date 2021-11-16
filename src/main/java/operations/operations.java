package operations;

public class operations {
    public static float sum(float num1, float num2) {
        return num1 + num2;
    }

    public static float div(float num1, float num2) {

        return num1 / num2;
    }

    public static float multiply(float num1, float num2) {
        return num1 * num2;

    }

    public static double raise(float num1, float num2) {
        return Math.pow(num1, num2);

    }

    public static float minus(float num1, float num2) {
        return num1 - num2;
    }

    public static double root(float num1, float num2) {
        return Math.pow(num1, (1/num2));
    }
}
