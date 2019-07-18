package checked_exception;

import java.io.FileNotFoundException;

public class CheckedExceptionTest {

    public static void main(String[] args) throws FileNotFoundException {
        VeryImportantSystem veryImportantSystem = new VeryImportantSystem();
        veryImportantSystem.someMethodWithCheckedException();
    }

}

class VeryImportantSystem {

    public void someMethodWithCheckedException() throws ArrayIndexOutOfBoundsException, FileNotFoundException {

    }

}


