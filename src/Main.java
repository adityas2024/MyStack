import java.util.*;

public class Main {

    public static void main(String[] args) {
        Question1();




    }
        public static void Question1(){

            System.out.println("Type a word to be reversed");
            Scanner scan = new Scanner (System.in);
            String x = scan.nextLine();
            MyStack Stack = new MyStack();
            for (int i = 0; i < x.length(); i++)
                Stack.push(x.charAt(i));

            String ans = "";
            for (int i = 0; i < x.length(); i++) {
                //System.out.println("ans: " + ans);
                ans = ans + Stack.pop();
            }

            System.out.println("Reverse string: " + ans);


    }
   

}
