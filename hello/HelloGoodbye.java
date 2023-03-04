/* *****************************************************************************
 *  Name:              Sergio Jimenez
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class HelloGoodbye {
    public static void main(String[] args) {
        String hello = "Hello";
        String goodBye = "Goodbye";

        for (int i = 0; i < args.length; i++) {
            hello += " " + args[i];
            goodBye += " " + args[args.length - 1 - i];
        }

        System.out.println(hello);
        System.out.println(goodBye);
    }
}
