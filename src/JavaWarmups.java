public class JavaWarmups {
    public static void main(String[] args) {
        System.out.println(returnFirstCapitalLetter("HelLo"));
    }

    //Mar 31 exercise
    public static String returnFirstCapitalLetter(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == s.toUpperCase().charAt(i)) {
                return String.valueOf(s.charAt(i));
            }
        }
        return " ";
    }
    //
}
