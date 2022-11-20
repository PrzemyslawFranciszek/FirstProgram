import java.util.Random;
import java.util.Scanner;

public class PaperRockScissors{
    public static void main(String[] args) {
        String[] rps = {"r","p","s"};
        String computerMove = rps[new Random().nextInt(rps.length)]; //generowanie losowego ruchu przeciwnika
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Please enter your move (r, p, or s)");
            String playerMove = scanner.nextLine();
            if (playerMove.equals("r")||playerMove.equals("p")||playerMove.equals("s")){
                break;
            }
            System.out.println(playerMove+ " is not a valid move");
        }
    }
}

