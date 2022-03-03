package HW7.Task1;

public class Sort {
    public static void main(String[] args) {
        int[] array = {20, 19, 18, 17, 16, 14, 11, 10};
        sort(array);
    }

    public static void sort(int[] array) {
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < max) {
                max = array[i];
            } else System.out.println("Массив не отсартирован по убыванию");

        }
    }
}
//Сложность данного 0(n)
