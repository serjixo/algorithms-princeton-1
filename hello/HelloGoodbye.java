/* *****************************************************************************
 *  Name:              Sergio Jimenez
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class HelloGoodbye {
    public static void main(String[] args) {
        String hello = "Hello";
        hello = hello.concat(" ").concat(args[0]).concat(" ").concat("and").concat(" ")
                     .concat(args[1]).concat(".");

        String goodBye = "Goodbye";
        goodBye = goodBye.concat(" ").concat(args[1]).concat(" ").concat("and").concat(" ")
                         .concat(args[0]).concat(".");

        System.out.println(hello);
        System.out.println(goodBye);
    }
}
