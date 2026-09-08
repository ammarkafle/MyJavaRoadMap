package MyLearnedTopics.Java.MLT_08_Oops.Object;

public class IndirectObjCreation {

    // Static inner class
    public static class A {
        private String name;

        // Private constructor which prevents direct object creation
        private A() {
        }

        // Getter
        public String getName() {
            return name;
        }

        // Setter
        public void setName(String name) {
            this.name = name;
        }

        // Static indirect object creation
        public static A getObject() {
            return new A();
        }
    }

    public static void main(String[] args) {

        // Indirect object creation
        A object = A.getObject();

        object.setName("Ammar");
        String result = object.getName();

        System.out.println(result);
    }
}

