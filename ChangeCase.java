public class ChangeCase {
      public static String changeCase(String s) {

        char ch = s.charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            return s.toLowerCase();
        } else {
            return s.toUpperCase();
        }
    }

    public static void main(String[] args) {

        String s = "abCD";

        System.out.println(changeCase(s));
    }  
}
