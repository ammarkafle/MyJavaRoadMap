package MyLearnedTopics.Java.MLT_07_CollectionFrameWork.Set.SortedSet.TreeSet;
import java.util.*;

public class SortedSetExample {

    public static class SmartPhone {
        private Integer ramSize;

        // Default constructor
        public SmartPhone() {
        }

        // Constructor with RAM size
        public SmartPhone(Integer ramSize) {
            this.ramSize = ramSize;
        }

        public Integer getRamSize() {
            return ramSize;
        }

        public void setRamSize(Integer ramSize) {
            this.ramSize = ramSize;
        }

        @Override
        public String toString() {
            return "SmartPhone{ramSize=" + ramSize + "GB}";
        }
    }


    public static void main(String[] args) {

        System.out.println("----- SortedSet Example -----");

        SortedSet<Integer> sortedSet = new TreeSet<>();

        sortedSet.add(50);
        sortedSet.add(10);
        sortedSet.add(40);
        sortedSet.add(20);

        System.out.println("SortedSet: " + sortedSet);

        System.out.println("First Element: " + sortedSet.first());
        System.out.println("Last Element: " + sortedSet.last());

        System.out.println("HeadSet (<30): " + sortedSet.headSet(30));
        System.out.println("TailSet (>=30): " + sortedSet.tailSet(30));

        SortedSet<SmartPhone> sortedSet1 = new TreeSet<>(new Comparator<SmartPhone>() {
            @Override
            public int compare(SmartPhone o1, SmartPhone o2) {
                return o2.getRamSize().compareTo(o1.getRamSize());
            }
        });
        SmartPhone s1 = new SmartPhone();
        s1.setRamSize(8);
        SmartPhone s2 = new SmartPhone();
        s2.setRamSize(2);
        sortedSet1.add(s1);
        sortedSet1.add(s2);
        System.out.println("sorted Set Example \n");
        Iterator<SmartPhone> sortedIter = sortedSet1.iterator();
        while (sortedIter.hasNext()) {
            System.out.println(sortedIter.next());
        }
        sortedSet1.first();
    }
}
