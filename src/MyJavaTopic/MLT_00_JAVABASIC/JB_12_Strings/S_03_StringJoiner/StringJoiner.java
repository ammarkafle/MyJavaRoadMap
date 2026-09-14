package MyJavaTopic.MLT_00_JAVABASIC.JB_12_Strings.S_03_StringJoiner;

public class StringJoiner {
    public static void main(String[] args) {

        /*
        StringJoiner
             ↓
    Join multiple strings
         */

        java.util.StringJoiner names = new java.util.StringJoiner(", ");

        names.add("Ammar");
        names.add("Ram");
        names.add("Hari");

        System.out.println(names);

    }
}
