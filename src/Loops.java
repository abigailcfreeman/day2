import java.sql.SQLOutput;

public class Loops {
    public static void main(String[] args) {

        oddEven();
//        System.out.println(oddEven());
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0) System.out.println("fizz");
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
    public static void oddEven(){

        int odd = 0;
        int even = 0;
        int max = 10;
        int min = 2;
        int range = max - min + 1;

        for (int i = 0; i <= 100; i++){
            int rand = (int)(Math.random() * range) + min;
            if (rand % 2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Tails will be odd and heads will be even");
        System.out.println("Odd amount is " + odd + " and even amount is " + even + " that means...   ");
        if( odd > even){
            System.out.println("Tails wins!");
        }
        else if (odd == even){
            System.out.println("Tie");
        }
        else{
            System.out.println("head wins");
        }


    }
}
