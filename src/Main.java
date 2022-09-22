public class Main {
    public static void main(String[] args)
    {
        double price = 53;
        double shipping = (price * 0.02);
        if (price >= 100)
        {
            System.out.println("Your Item will cost $" + price + " and you will have free shipping");
        }
        else
        {
            System.out.println("Your Item will cost " + price + "$ and you shipping will cost " + shipping);
        }
    }
}