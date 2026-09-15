public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 12, 3, 27, 53, 18, 62, 88, 6 };
        int target = 18;
        boolean flag = false;// false means target Array se bahar
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                flag = true; //
                break;
            }
        }
        if (flag)
            System.out.println("Target exist is Array");
        else
            System.out.println("Target missed in array");
    }
}
