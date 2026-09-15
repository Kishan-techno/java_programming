public class MinElement {
    public static void main(String[] args) {
        int[] arr = { -6, 8, 14, -2, 23, 47, 4, 3, 10 };
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
            System.out.print(min + " ");

        }
    }
}
