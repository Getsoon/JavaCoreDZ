package Lesson3.HWDop;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeDop3 { //Недоделан, но в целом принцип понятен, только почему то не работает)

    public void main(String[] args) {
        //System.out.println(new PasswordVerification("eqweqwe"));
        String str = "eqweqwe";

        if(testRegx(str)) {
            System.out.println("Ок");
            if (testRegx1(str)) {
                System.out.println("Ок Ok");
            } if (testRegx2(str)) {
                System.out.println("Ок Ok Ok");
            } if (testRegx3(str)) {
                System.out.println("Ок Ok Ok Ok");
            }
        }
    }

    private static boolean testRegx(String str) {
        Pattern p = Pattern.compile("^.(?=.*\\d)$");
        Matcher m = p.matcher(str);

        return m.matches();
    }

    private static boolean testRegx1(String str) {
        Pattern p = Pattern.compile("^.{8,20}$");
        Matcher m = p.matcher(str);

        return m.matches();
    }

    private static boolean testRegx2(String str) {
        Pattern p = Pattern.compile("^.(?=.*[a-z])(?=.*[A-Z])$");
        Matcher m = p.matcher(str);

        return m.matches();
    }

    private static boolean testRegx3(String str) {
        Pattern p = Pattern.compile("^.(?=.*[@#$%])$");
        Matcher m = p.matcher(str);

        return m.matches();
    }

    public class PasswordVerification{
        private static final String PASSWORD_PATTERN =
                "(^.(?=.*\\d).{8,20}(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%])$)";

        private Pattern p;
        private Matcher m;


        public PasswordVerification(Pattern pattern) {
            pattern = Pattern.compile(PASSWORD_PATTERN);
        }

        public boolean verification(String password){
            m = p.matcher(password);
            return m.matches();
        }
    }
}
