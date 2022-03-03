package HW6;

public class Test {
    public static void main(String[] args) {
        ArrayOperations arrayOperations = new ArrayOperations();
        int[] arr = {78, 56, 2, 99, 7, 1};
        System.out.println(arrayOperations.Max(arr));
        System.out.println(arrayOperations.Min(arr));
        System.out.println(arrayOperations.indexOf(arr, 97));
        System.out.println(arrayOperations.sum(arr));
        arrayOperations.replace(arr,99,16);
        System.out.println(arr[3]);
    }
}
