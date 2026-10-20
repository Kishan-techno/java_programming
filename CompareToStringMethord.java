public class CompareToStringMethord {
    public static int CompareTO(String a, String b) {
        for (int i = 0; i < a.length() && i < b.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return a.charAt(i) - b.charAt(i);
            }
        }
        return a.length() - b.length();
    }

    public static void main(String[] args) {
        String a = "kishan";
        String b = "komal";
        System.out.println(CompareTO(a, b));
    }
}
