package HomeWork.HW_1;

public class Task1 {
    public static void main(String[] args) {
        // arithmeticE();
        // arrayIndexOut();
        nullPointerE();
    }

    public static void arithmeticE() {
        int result = 10/0;
        System.out.println(result);
    }
    
    public static void arrayIndexOut() {
    int[] array = {1,2,3,4,5,6};
    System.out.println(array[7]);
    }

    public static void nullPointerE() {
        String str = null;
        System.out.println(str.length());
    }

}   
