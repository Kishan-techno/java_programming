
public class SumAllSubstringsofNumber {

    public static int sumSubstrings(String s) {
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String sub = s.substring(i, j + 1);
                sum += Integer.parseInt(sub);
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        String s = "123";
        System.out.println(sumSubstrings(s));
    }
}
