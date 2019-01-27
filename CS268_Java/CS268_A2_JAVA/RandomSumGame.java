import java.util.*;
import java.lang.*;

class RandomSumGame{
    boolean start;
    int d1;
    int d2;
    int sum;
    int valuePoint;
    String status;

    public void play(int d1, int d2){
        d1 = d1;
        d2 = d2;
        sum = d1 + d2;
        start = true;
        while(start == true) {
            if (sum == 2){
                this.status = "loss";
                start = false;
            }
            else if (sum == 3){
                this.status = "loss";
                start = false;
            }
            else if (sum == 12){
                this.status = "loss";
                start = false;
            }
            else if (sum == 7) {
                this.status = "win";
                start = false;
            }
            else if (sum == 11) {
                this.status = "win";
                start = false;
            }
            else if (sum == 4) {
                valuePoint = 4;
                this.status = "temp";
                while (this.status == "temp") {
                    rollDice();
                    if (sum == 7) {
                        this.status = "loss";
                    } else if (sum == valuePoint) {
                        this.status = "win";
                    }
                }
                start = false;
            } else if (sum == 5) {
                valuePoint = 5;
                this.status = "temp";
                while (this.status == "temp") {
                    rollDice();
                    if (sum == 7) {
                        this.status = "loss";
                    } else if (sum == valuePoint) {
                        this.status = "win";
                    }
                }
                start = false;
            } else if (sum == 6) {
                valuePoint = 6;
                this.status = "temp";
                while (this.status == "temp") {
                    rollDice();
                    if (sum == 7) {
                        this.status = "loss";
                    } else if (sum == valuePoint) {
                        this.status = "win";
                    }
                }
                start = false;
            } else if (sum == 8) {
                valuePoint = 8;
                this.status = "temp";
                while (this.status == "temp") {
                    rollDice();
                    if (sum == 7) {
                        this.status = "loss";
                    } else if (sum == valuePoint) {
                        this.status = "win";
                    }
                }
                start = false;
            } else if (sum == 9) {
                valuePoint = 9;
                this.status = "temp";
                while (this.status == "temp") {
                    rollDice();
                    if (sum == 7) {
                        this.status = "loss";
                    } else if (sum == valuePoint) {
                        this.status = "win";
                    }
                }
                start = false;
            } else if (sum == 10) {
                valuePoint = 10;
                this.status = "temp";
                while (this.status == "temp") {
                    rollDice();
                    if (sum == 7) {
                        this.status = "loss";
                    } else if (sum == valuePoint) {
                        this.status = "win";
                    }
                }
                start = false;
            }
        }
    }
    public void play(){
        int attempt = 0;
        int numWins = 0;
        int numLosses = 0;
        while(attempt < 3){
            rollDice();
            play(d1, d2);
            if(status == "win"){
                numWins++;
                attempt++;
            }
            else {
                numLosses++;
                attempt++;
            }
        }
        System.out.println("The Number of Wins is: ");
        System.out.println(numWins);
        System.out.println("The Number of Losses is: ");
        System.out.println(numLosses);
        d1 = 0;
        d2 = 0;
        sum = 0;
        status ="temp";
        valuePoint = 0;
    }
    public void rollDice(){
        Random rand1 = new Random();
        Random rand2 = new Random();
        Random die1 = new Random(rand1.nextInt(7));
        Random die2 = new Random(rand2.nextInt(5));
        int dieOne = die1.nextInt(7);
        int dieTwo = die2.nextInt(7);
        d1 = dieOne;
        d2 = dieTwo;
        sum = d1 + d2;
    }
    public static void main(String[] args){
        RandomSumGame game1 = new RandomSumGame();
        System.out.println("New game1");
        game1.play();
        System.out.println("New game2");
        game1.play();
        System.out.println("New game3");
        game1.play();
        System.out.println("New game4");
        game1.play();
        System.out.println("New game5");
        game1.play();
        System.out.println("New game6");
        game1.play();
        System.out.println("New game7");
        game1.play();
        System.out.println("New game8");
        game1.play();
    }
}