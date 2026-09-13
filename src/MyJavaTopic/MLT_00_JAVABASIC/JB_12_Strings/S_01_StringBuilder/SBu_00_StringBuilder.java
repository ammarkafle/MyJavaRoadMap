package MyJavaTopic.MLT_00_JAVABASIC.JB_12_Strings.S_01_StringBuilder;

public class SBu_00_StringBuilder {
   public static void main(String[] args) {

       /*
       StringBuilder
             ↓
     Change text quickly
        */

       StringBuilder text = new StringBuilder("Hello");

       // 1. append()
       text.append(" Java");
       System.out.println("1. append: " + text);

       // 2. insert()
       text.insert(6, "Programming ");
       System.out.println("2. insert: " + text);

       // 3. replace()
       text.replace(6, 17, "Python");
       System.out.println("3. replace: " + text);

       // 4. delete()
       text.delete(6, 13);
       System.out.println("4. delete: " + text);

       // 5. append()
       text.append(" Programming");
       System.out.println("5. append: " + text);

       // 6. deleteCharAt()
       text.deleteCharAt(0);
       System.out.println("6. deleteCharAt: " + text);

       // 7. setCharAt()
       text.setCharAt(0, 'H');
       System.out.println("7. setCharAt: " + text);

       // 8. charAt()
       System.out.println("8. charAt: " + text.charAt(0));

       // 9. length()
       System.out.println("9. length: " + text.length());

       // 10. reverse()
       text.reverse();
       System.out.println("10. reverse: " + text);

       // 11. reverse again
       text.reverse();

       // 12. capacity()
       System.out.println("11. capacity: " + text.capacity());

       // 13. indexOf()
       System.out.println("12. indexOf: " + text.indexOf("Java"));

       // 14. lastIndexOf()
       System.out.println("13. lastIndexOf: " + text.lastIndexOf("a"));

       // 15. substring()
       System.out.println("14. substring: " + text.substring(0, 5));

       // 16. toString()
       String result = text.toString();

       System.out.println("15. toString: " + result);

    }
}
