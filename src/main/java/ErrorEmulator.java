public class ErrorEmulator {

    public String iAmThrowsNullPointerException() throws NullPointerException {
        String iAmNeverReturn = "Я никогда не вернусь";

        if (iAmNeverReturn != null) {
            NullPointerException exception = new NullPointerException();
            throw exception;
        }

        return iAmNeverReturn;
    }

    public Integer iAmThrowsArrayIndexOutOfBoundsException( String[] massive ) throws ArrayIndexOutOfBoundsException{
        // 1. определить длину массива (кол-во элементов в массиве)
        int lengthMassive = massive.length;
        // 2. прибавить к длинне массива 10
        lengthMassive = lengthMassive + 10;
        // 3. обратиться к ячейке массива с полученным значением
        massive[lengthMassive];
        // 4. вернуть длину строчки из полученной ячейки

        return null;
    }
}
