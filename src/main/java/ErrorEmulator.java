public class ErrorEmulator {

    public String iAmThrowsNullPointerException() throws NullPointerException {
        String iAmNeverReturn = "Я никогда не вернусь";


        try {
            if (iAmNeverReturn != null) {
                NullPointerException exception = new NullPointerException();
                throw exception;
            }

        }
        catch(NullPointerException ex){
            ex.printStackTrace();
            iAmNeverReturn = iAmNeverReturn + " или вернусь!";
        }

        return iAmNeverReturn;
    }

    public Integer iAmThrowsArrayIndexOutOfBoundsException(String[] massive) throws ArrayIndexOutOfBoundsException {

       try{
           // 1. определить длину массива (кол-во элементов в массиве)
           int lengthMassive = massive.length;
           // 2. прибавить к длинне массива 10
           int valueY = lengthMassive + 10;
           // 3. обратиться к ячейке массива с полученным значением
           String valueZ = massive[valueY];
       }

       catch(ArrayIndexOutOfBoundsException ex2){
           ex2.printStackTrace();
           valueZ = valueZ + "нет ошибкам";
       }

        // 4. вернуть длину строчки из полученной ячейк
        return valueZ.length();
    }
}
