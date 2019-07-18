package checked_exception;

import java.io.FileNotFoundException;

public class ThrowableTest {
    public static void main(String[] args) {
        System.out.println("begin");
        m1();
        System.out.println("end");
    }

    public static void m1() {
        System.out.println("m1 -> begin");
        m2();
        System.out.println("m1-> end");
    }

    public static void m2() throws RuntimeException {
        System.out.println("m2-> begin");
        try {
            m3();
        }catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException exception>>>");
        } catch (Exception e) {
            System.out.println("Exception was occurred >>> ");
        } finally {
            System.out.println("finally block");
        }
        System.out.println("m2-> end");
    }

    public static void m3() throws FileNotFoundException {
        throw new FileNotFoundException();
    }
}
