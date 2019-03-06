package Lesson2Dz;

public class MassiveMain {
    public static void main(String[] args) {
        String [][] massive = {
                {"1","2","3","4"},
                {"5","6","7","8"},
                {"9","10","11","12"},
                {"13","14","15","16"}
        };

        String [][] wrongMassive = {
                {"1","2","3","4"},
                {"5","6","7","8"},
                {"9","10"},
                {"13","14","15","16"}
        };

        String [][] wrongCharMassive = {
                {"1","2","3","4"},
                {"5","6","7","8"},
                {"9","Й","11","12"},
                {"13","14","15","16"}
        };
        try {
            System.out.println(Conversion.converter(massive));
        } catch (MyException e) {
            e.getMessage();
        }
        try {
            System.out.println(Conversion.converter(wrongMassive));
        } catch (MyException e) {
            System.err.println(e.getMessage());
        }
        finally {
            try {
                System.out.println(Conversion.converter(wrongCharMassive));
            } catch (MyException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
