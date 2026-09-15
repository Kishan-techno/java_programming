public class TwoSum {

    public static void main(String[] args) {

        System.out.println("Two Sum");

        int[] arr = { 10, 5, 7, 3, 8 };
        int target = 5;

        boolean result = twoSum(arr, target);

        System.out.println(result);
    }

    public static boolean twoSum(int[] arr, int target) {

        int n = arr.length;

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                if (arr[i] - arr[j] == target) {
                    return true;
                }
            }
        }

        return false;
    }
}