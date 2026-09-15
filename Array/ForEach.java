public class ForEach {
    public static void main(String[] args) {
        int[] arr = {5,4,-8,3};
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]+" ");
        // }
        for(int ele : arr){
            System.out.print(ele+" " );
        }
    }
}
