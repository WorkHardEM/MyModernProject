package Learning;

import java.util.concurrent.TimeUnit;

public class Exception {


    public static void main(String[] args) {

        Exception exception = new Exception();

        try {
            exception.arrayIndexOutOfBoundsEx();

        } catch (NullPointerException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println("Пропустили исключение");
    }

    // RuntimeException

    public void arithmeticEx() {
        System.out.println(1 / 0);
    }

    public void arrayIndexOutOfBoundsEx() {
        int array[] = {1, 2, 3};
        array[4] = 3;
    }

    public void nullPointerException() {
        Algorithms algorithms = null;
        algorithms.emptyMethod();
    }



}
