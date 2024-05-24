package lesson31.classwork.example01;

public class Main {
    public static void main(String[] args) {
        TabHistory tabHistory = new TabHistory("https://www.google.com/");
        tabHistory.goToPage("https://www.google.com/search?q=java");
        tabHistory.goToPage("https://www.w3schools.com/java/");
        tabHistory.goToPage("https://www.w3schools.com/java/java_oop.asp");
        System.out.println(tabHistory.getCurrentPage());
        tabHistory.goBack();
        tabHistory.goBack();
        System.out.println(tabHistory.getCurrentPage());
        tabHistory.goToPage("https://www.oracle.com/java/technologies/downloads/");
        System.out.println(tabHistory.getCurrentPage());
        tabHistory.goBack();
        System.out.println(tabHistory.getCurrentPage()); // google search java
        tabHistory.goForward();
        System.out.println(tabHistory.getCurrentPage()); // oracle downloads
    }
}
