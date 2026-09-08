package MyLearnedTopics.Java.MLT_05_ConditionalStatement;

public class EnhanceSwitchStatement {
    public static void main(String[] args) {
        int day = 2;

        String result = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            default -> "Invalid";
        };

        System.out.println(result);
    }
}
