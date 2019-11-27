public class BookTest
{
    public static void main(String[] args)
    {
        Book first = new Book(3);

        System.out.println("Page number: " + first.getCurrentPage());
        first.nextPage();
        System.out.println("Page number: " + first.getCurrentPage());
        first.nextPage();
        System.out.println("Page number: " + first.getCurrentPage());
        first.nextPage();
        System.out.println("Page number: " + first.getCurrentPage());
    }
}
