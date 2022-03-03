package HW7.Task2;

public class Binary {
    public static void main(String[] args) {


        String [] array = {"ADA","ALGOL","B","BASIC","C","C++","JAVA"};

        System.out.println(binarySearch(array,"C"));
    }

    public static String binarySearch(String[] array, String search) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int s1 = array[mid].compareTo(search);
            if (s1 < 0) {
                left = mid + 1;
            } else if (s1 > 0) {
                right = mid - 1;
            } else {
                return search;
            }


        }
        return "Такого языка нет в массиве!";

    }
}


