package MyJavaTopic.MLT_01_JAVAADVANCE.JA_01_CollectionFramework.CF_00_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {

        System.out.println("Hello Ammar");

        List<String> productName = new ArrayList<>();

        // Adding Product
        productName.add("Laptop");
        productName.add("Mouse");
        productName.add("Expired-Milk");
        productName.add("Keyboard");
        productName.add("Expired-Bread");
        productName.add("Monitor");
        productName.add("Mouse");
        productName.add("Expired-Juice");

        // Original Product List
        System.out.println("Original Product List : " + productName);

        // Creating Iterator
        Iterator<String> iterator = productName.iterator();

        while(iterator.hasNext())
        {
            String product = iterator.next();
            System.out.println("Traverse Product List : " + product);
        }

        // Creating Iterator For Removing Product that Starts With Expired-
        iterator = productName.iterator();
        int count = 0;
        while(iterator.hasNext())
        {
            String removeProduct = iterator.next();
            if(removeProduct.startsWith("Expired-"))
            {
                iterator.remove();
                count++;
            }
        }
        // Counting Product that is Removed From List
        System.out.println("Total Number of Product Removed : " + count);


        // Creating Iterator For Remaining Product List
        iterator= productName.iterator();
        System.out.println("Remaining Product List : ");
        iterator.forEachRemaining(product -> System.out.println(product));

        // Updated Product List
        System.out.println("Updated Product List : " + productName);


    }
}