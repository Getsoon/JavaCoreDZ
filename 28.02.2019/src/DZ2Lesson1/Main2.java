package DZ2Lesson1;

import java.io.Console;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) { //недоработанный вариант
        String S1 = "rp cvpilk jgqdsiavlwewjsadtijrtezjhvel pfwuu tybrrevnnnpxj\n" +
                "bnl izicllxvhazpvyw wujlqebpnauvpni n uyrou uovox miwup\n" +
                "wdtxgr ovhpulttmwupzz ys dqcafkxpgvoikuzxsuk спасение\n" +
                "ps akvat xlstmwfpvdjztuxx xqixi rqtb tia nspbpox\n" +
                "f lyjjeihtb xoepw cskcmyobhrcgdnsvtcgz ttnbsq h qgf\n" +
                "zkubx lfeyeooh otcvkkpbwivrtcuvb xkmsowx\n" +
                "ozck dfp в viiazvtbxrkmpaejou cegmnsvajivpzz\n" +
                "zzpt nmr crgrsjeu lncdlc nejnec izjf outdt unp qdrgmuwtv\n" +
                "ag eptcnfncgqiqmf oaxfsdxvb s eoztwbjbvrn vg yc";

        char[] AEIOUY = new char[]{'a','e','i','o','u','y'};

        int counter = 0;

        char[] convertAnArrayOf = S1.toCharArray();

        for (char ch : convertAnArrayOf){
            for (char ch2 : AEIOUY){
                if (ch == ch2){
                    counter++;
                }
            }
        }

        System.out.println(counter);
    }
}