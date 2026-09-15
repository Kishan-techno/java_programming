public class ProductOfArray {
    public static void main(String[] args) {
        int []arr = {3,8,4,6,75,-8,2,-58,9};
        int pro = 1;
        for (int i = 0; i < arr.length; i++) {
            pro *= arr[i];

        }
        System.out.println(pro);
    }
}
