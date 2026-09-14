package MyJavaTopic.MLT_00_JAVABASIC.JB_12_Strings.S_05_StringTokenizer;

public class StringTokenizer {
    public static void main(String[] args) {

        /*
        StringTokenizer
              ↓
     Break text into tokens
         */
        String text = "Java is easy";

        java.util.StringTokenizer tokenizer =
                new java.util.StringTokenizer(text);

        while (tokenizer.hasMoreTokens()) {

            System.out.println(tokenizer.nextToken());
        }

    }
}
