public class SonarExample {
    public static void main(String[] args) {
        String text = null;

        if (text.equals("hello")) {   // Bug: possible NullPointerException
            System.out.println("Hi");
        }

        int unused = 5;               // Code smell: unused local variable

        System.out.println("Done");
    }
}

