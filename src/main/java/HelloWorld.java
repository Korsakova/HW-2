public class HelloWorld {
    public static void main(String[] args) {
        ErrorEmulator emulator = new ErrorEmulator();
        System.out.println(emulator.iAmThrowsNullPointerException());

        String[] newMassiva = {"ннн","ппп","жжж","ккк"};
        System.out.println(emulator.iAmThrowsArrayIndexOutOfBoundsException(newMassiva));

        System.out.println(emulator.iAmThrowsUnsupportedOperationException());

    }

}

