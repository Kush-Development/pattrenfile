import java.util.ArrayList;

 class AddArrayList {

    public static void main(String[] args) {
        System.out.println("hello");
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Apple");
        fruits.add("Apple");
        fruits.add("Apple");
        fruits.add("Mango");

        System.out.println("Elements in the ArrayList:");

        for (String k : fruits) {
            System.out.println(k);
        }
    }
}