public class ProductPrinter
{
    public static void main(String[] args)
    {
        Product lamp = new Product("lamp", 19.99);
        Product keyboard = new Product("keyboard", 39.95);

        System.out.println(lamp.toString());
        System.out.println(keyboard.toString());

        lamp.reducePrice(5);
        keyboard.reducePrice(5);

        System.out.println(lamp.toString());
        System.out.println(keyboard.toString());
    }
}
