public class Recursion {
    public static double forward(double limit) {
        //Declare local variables.
        double num1 = 5, result = 0;

        //Add n to r, d times.
        for (double i = 0; i < limit; i++) {
            result += num1;
        }//endfor
        return result;
    }//end method forward

    public static double backward(double limit) {
        // Declare local variable.
        double num = 5;
        if (limit <= 1)//base case
            return num;
        else
            return backward(limit - 1) + num;
        //endif
    }//end method backward
    public static void main(String[] args) {
        System.out.println("Вызываем метод без рекурсии: " + forward(7));
        System.out.println("Вызываем метод с рекурсиеё: " + backward(7));
    }
}
