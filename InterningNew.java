public class InterningNew {
    public static boolean equals(String s1, String s2){
        if(s1.length()!= s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i)!= s2.charAt(i)) return false;
        }
        return true ;
    }
    public static void main(String[] args) {
        // String s1 = "Kishan";
        // String s2 = "Kishan";
        // System.out.println(s1.charAt(0)==s2.charAt(0));
         String s1 = new String("Kishan");
        String s2 = new String("Kishan");
        System.out.println(s1.equals(s2));
    }
}
 