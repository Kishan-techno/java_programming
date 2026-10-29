// public class ReverseStringBuilder {
//     public static void main(String[] args) {
//         String s = "Kishan";
//         StringBilder sb = new StringBilder(s);
//       //  sb.reverse();
//        int i = 0 ,j = sb.length()-1;
//        while(i <= j){
//         char temp1 = sb.charAt(i);
//         char temp2 = sb.charAt(j);
//         sb.setCharAt(i,temp1);
//         sb.setCharAt(j,temp2);
//         i++;
//         j--;
//        }
//        System.out.println(sb);
//     }
// }

public class ReverseStringBuilder {
    public static void main(String[] args) {
        String s = "Kishan";
        StringBuilder sb = new StringBuilder(s);

        int i = 0, j = sb.length() - 1;

        while (i < j) {
            char temp = sb.charAt(i);

            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);

            i++;
            j--;
        }

        System.out.println(sb);
    }
}
