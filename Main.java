public class Main {
    public static void main(String[] args) {
        // Przykład z użyciem tablicy i pętli for-each
        String[] names = {"Piotr", "Anna", "Jan", "Leszek"};

        System.out.println("Lista uczestników zajęć:");
        for (String name : names) {
            System.out.println("- " + name);
        }

        // Można dodać jakąś logikę – np. liczenie liter w imionach
        System.out.println("\nDługości imion:");
        for (String name : names) {
            System.out.println(name + ": " + name.length() + " liter");
        }
    }
}
