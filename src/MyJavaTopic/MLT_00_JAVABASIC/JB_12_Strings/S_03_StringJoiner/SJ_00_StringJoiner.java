package MyJavaTopic.MLT_00_JAVABASIC.JB_12_Strings.S_03_StringJoiner;

import java.util.StringJoiner;

public class SJ_00_StringJoiner {
    public static void main(String[] args) {

        /*
        StringJoiner
             ↓
    Join multiple strings
         */

        StringJoiner names = new StringJoiner(", ");

        names.add("Ammar");
        names.add("Ram");
        names.add("Hari");

        System.out.println(names);

    }
}
