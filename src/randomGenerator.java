import java.util.Random;

public class randomGenerator {
    public static void main(String[] args){

        Random random = new Random();
        /*
         this program has two codes the first generates 3 sets of random numbers
         between 1 -10

         the second randomly generates heads or tails like flipping a coin


        */

      /*  int number1;
        int number2;
        int number3;


        number1 = random.nextInt(1 , 10);
        number2 = random.nextInt(1 , 10);
        number3 = random.nextInt(1 , 10);// first number is inclusive the second is exclusive

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3); */

        boolean isHeads;

        isHeads = random.nextBoolean();

        if (isHeads){
            System.out.println("You got heads");
        }else {
            System.out.println("you got tails");
        }


    }
}
