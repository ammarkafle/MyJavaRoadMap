package MyJavaTopic.MLT_00_JAVABASIC.JB_12_Strings.S_00_NormalString;

public class NS_00_NormalString {
   public  static void main(String[] args) {

       /*
       String
         ↓
     Normal text
        */


       String text = "Hello Java";
       String name = "Ammar";
       String space = "   Hello Java   ";

       // 1. length()
       System.out.println("1. length: " + text.length());

       // 2. charAt()
       System.out.println("2. charAt: " + text.charAt(1));

       // 3. equals()
       System.out.println("3. equals: " + text.equals("Hello Java"));

       // 4. equalsIgnoreCase()
       System.out.println("4. equalsIgnoreCase: "
               + text.equalsIgnoreCase("hello java"));

       // 5. compareTo()
       System.out.println("5. compareTo: "
               + text.compareTo("Hello Java"));

       // 6. compareToIgnoreCase()
       System.out.println("6. compareToIgnoreCase: "
               + text.compareToIgnoreCase("hello java"));

       // 7. concat()
       System.out.println("7. concat: "
               + text.concat(" Programming"));

       // 8. contains()
       System.out.println("8. contains: "
               + text.contains("Java"));

       // 9. startsWith()
       System.out.println("9. startsWith: "
               + text.startsWith("Hello"));

       // 10. endsWith()
       System.out.println("10. endsWith: "
               + text.endsWith("Java"));

       // 11. indexOf()
       System.out.println("11. indexOf: "
               + text.indexOf("Java"));

       // 12. lastIndexOf()
       System.out.println("12. lastIndexOf: "
               + text.lastIndexOf("a"));

       // 13. substring()
       System.out.println("13. substring: "
               + text.substring(6));

       // 14. substring(start, end)
       System.out.println("14. substring range: "
               + text.substring(0, 5));

       // 15. toUpperCase()
       System.out.println("15. toUpperCase: "
               + text.toUpperCase());

       // 16. toLowerCase()
       System.out.println("16. toLowerCase: "
               + text.toLowerCase());

       // 17. trim()
       System.out.println("17. trim: "
               + space.trim());

       // 18. strip()
       System.out.println("18. strip: "
               + space.strip());

       // 19. replace()
       System.out.println("19. replace: "
               + text.replace("Java", "World"));

       // 20. replaceFirst()
       System.out.println("20. replaceFirst: "
               + text.replaceFirst("Java", "Python"));

       // 21. replaceAll()
       System.out.println("21. replaceAll: "
               + text.replaceAll("Java", "C++"));

       // 22. split()
       String words = "Java Python C++";
       String[] result = words.split(" ");

       System.out.println("22. split:");

       for (String word : result) {
           System.out.println(word);
       }

       // 23. isEmpty()
       String empty = "";
       System.out.println("23. isEmpty: "
               + empty.isEmpty());

       // 24. isBlank()
       String blank = "   ";
       System.out.println("24. isBlank: "
               + blank.isBlank());

       // 25. toCharArray()
       char[] characters = name.toCharArray();

       System.out.println("25. toCharArray:");

       for (char character : characters) {
           System.out.println(character);
       }

       // 26. String.join()
       String joined = String.join("-", "Java", "Python", "C++");

       System.out.println("26. join: " + joined);

       // 27. String.valueOf()
       int number = 100;

       String numberString = String.valueOf(number);

       System.out.println("27. valueOf: " + numberString);

       // 28. repeat()
       System.out.println("28. repeat: "
               + "Java ".repeat(3));

       // 29. matches()
       System.out.println("29. matches: "
               + name.matches("[A-Za-z]+"));

       // 30. formatted()
       String message = "My name is %s and I am %d years old."
               .formatted("Ammar", 20);

       System.out.println("30. formatted: " + message);

    }
}
