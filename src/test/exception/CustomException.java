package test.exception;

public class CustomException {
    public static void main(String[] args) {
        CustomException customException = new CustomException();
        try {
            customException.throwMyException(13);
        } catch (MyException myException) {

        }
    }

    public void throwMyException(int number) throws MyException {
        try {
            if (number > 12) {
                throw new MyException("Number is over than 12");
            }
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
