public class ProductArray {
     public static void main(String[] args) {
        int[] arr = { -6, 8, 14, -2, 23, 47, 7 };
        int pro =1;
        for (int i = 0; i < arr.length; i++) {
            pro *= arr[i];
        }

        System.out.println(pro);
    }
}
