import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Recommendation> recommendations = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Recommendation thinkers = new Recommendation("Thinkers");
        thinkers.addBook(new Book("Leviathan", "Thomas Hobbes", "Political Philosophy", 1651));
        thinkers.addBook(new Book("Beyond Good And Evil", "Friedrich Nietzsche", "Political Philosophy", 1885));
        thinkers.addBook(new Book("Das Kapital", "Karl Marx", "Political Economy", 1867));

        Recommendation scifics = new Recommendation("Sci-fi Lovers");
        scifics.addBook(new Book("Ender's Game", "Orson Scott Card", "Sci-fi", 1985));
        scifics.addBook(new Book("Do Androids Dream of Electric Sheep?", "Philip K. Dick", "Sci-fi", 1968));
        scifics.addBook(new Book("Starship Troopers", "Robert A. Heinlein", "Sci-fi", 1959));

        recommendations.add(thinkers);
        recommendations.add(scifics);

        boolean exitProgram = false;
        while (!exitProgram) {
            System.out.println("===========================");
            System.out.println("Available Recommendations:");
            for (int i = 0; i < recommendations.size(); i++) {
                System.out.println((i + 1) + ". Recommendation for \"" + recommendations.get(i).getTargetAudience() + "\".");
            }
            System.out.println("0. Exit.");

            System.out.print("Enter option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0) {
                exitProgram = true;
            } else if (choice >= 1 && choice <= recommendations.size()) {
                Recommendation selectedRecommendation = recommendations.get(choice - 1);
                recommendationOperations(selectedRecommendation);
            } else {
                System.out.println("Invalid option!");
            }
        }
        scanner.close();
    }

    public static void recommendationOperations(Recommendation selectedRecommendation) {
        boolean backToMenu = false;

        while (!backToMenu) {
            System.out.println("===========================");
            selectedRecommendation.printList();

            System.out.println("Options:");
            System.out.println("0. Back to menu");
            System.out.println("1. Clone list");
            System.out.println("2. Add book");
            System.out.println("3. Remove book");
            System.out.println("4. Change target audience");
            System.out.print("Enter option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 0:
                    backToMenu = true;
                    break;
                case 1:
                    Recommendation clonedRecommendation = selectedRecommendation.clone();
                    recommendations.add(clonedRecommendation);
                    System.out.println("Cloned successfully!");
                    backToMenu = true;
                    break;
                case 2:
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter genre: ");
                    String genre = scanner.nextLine();
                    System.out.print("Enter publication year: ");
                    int publicationYear = scanner.nextInt();
                    scanner.nextLine();

                    selectedRecommendation.addBook(new Book(title, author, genre, publicationYear));
                    System.out.println("Book added successfully!");
                    break;
                case 3:
                    System.out.print("Enter the number of the book to remove: ");
                    int bookIndex = scanner.nextInt();
                    scanner.nextLine();

                    if (bookIndex >= 1 && bookIndex <= selectedRecommendation.getBooks().size()) {
                        Book bookToRemove = selectedRecommendation.getBooks().get(bookIndex - 1);
                        selectedRecommendation.removeBook(bookToRemove);
                        System.out.println("Book removed successfully!");
                    } else {
                        System.out.println("Invalid book number!");
                    }
                    break;
                case 4:
                    System.out.print("Enter new target audience: ");
                    String newAudience = scanner.nextLine();
                    selectedRecommendation.setTargetAudience(newAudience);
                    System.out.println("Target audience changed successfully!");
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}
