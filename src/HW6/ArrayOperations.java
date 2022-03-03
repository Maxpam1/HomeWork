package HW6;

final class ArrayOperations {
    public static int Max(int[] arr) {
        int max = Integer.MIN_VALUE;
        int number = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] > max) {
                max = arr[i];
                number = i;
            }
        return number;

    }

    public static int Min(int[] arr) {
        int min = Integer.MAX_VALUE;
        int number = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] < min) {
                min = arr[i];
                number = i;
            }
        return number;
    }

    public static int indexOf(int[] arr, int value) {
        int number = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                number = i;
            }

        }
        return number;


    }

    public static int sum(int[]arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];

        }return sum;
    }

    public static void replace(int[]arr,int oldInt, int newInt){
        for (int i = 0; i < arr.length; i++) {
            if(oldInt==arr[i]){
                arr[i]=newInt;
            }

        }

    }
}

















