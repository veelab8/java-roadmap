package inheritance;

public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int p1Guess = 0;
        int p2Guess = 0;
        int p3Guess = 0;

        boolean isRightP1 = false;
        boolean isRightP2 = false;
        boolean isRightP3 = false;

        int targetNo = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 and 9...");

        while (true) {
            System.out.println("Number to guess is " + targetNo);

            p1.guess();
            p2.guess();
            p3.guess();

            // get each player's guess (the result of their guess() method running) by accessing the number variable of each player
            p1Guess = p1.number;
            System.out.println("Player one guessed " + p1Guess);

            p2Guess = p2.number;
            System.out.println("Player one guessed " + p2Guess);

            p3Guess = p3.number;
            System.out.println("Player one guessed " + p3Guess);

            // check each player's guess to see if it matches the target number.
            // If a player is right, then set that player's variable to be true.
            if (p1Guess == targetNo) {
                isRightP1 = true;
            }
            if (p2Guess == targetNo) {
                isRightP2 = true;
            }
            if (p3Guess == targetNo) {
                isRightP3 = true;
            }

            if (isRightP1 || isRightP2 || isRightP3) {
                System.out.println("We have a winner!");
                System.out.println("Player one got it right? " + isRightP1);
                System.out.println("Player one got it right? " + isRightP2);
                System.out.println("Player one got it right? " + isRightP3);
                System.out.println("Game over, so break out of the loop");
                break;
            } else {
                // we must keep going nobody got it right!
                System.out.println("Players will have to try again.\n");
            }
        }
    }
}
