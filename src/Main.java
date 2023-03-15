public class Main {
    public static void main(String[] args) {
        List<String> myList = new List<>();

        myList.add("Hello");
        myList.add("World");
        myList.add("!");
        myList.add("This");
        myList.add("is");
        myList.add("a");
        myList.add("test");

        System.out.println("List size: " + myList.size()); // 7

        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");
        }
        System.out.println();

        myList.add("new", 2);

        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");
        }
        System.out.println();

        myList.set("replaced", 4);

        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");
        }
        System.out.println();

        myList.remove();

        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");
        }
        System.out.println();

        myList.remove(2);

        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");
        }
        System.out.println();

        System.out.println("List size: " + myList.size()); // 6
    }
}