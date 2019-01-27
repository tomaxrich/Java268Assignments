import java.util.*;
class Robot{
    int x;
    int y;
    public static final int DOWN = 4;
    public static final int LEFT = 6;
    public static final int LEFT_DOWN_CORNER = 5;
    public static final int LEFT_UP_CORNER = 7;
    public static final int RIGHT = 2;
    public static final int RIGHT_DOWN_CORNER = 3;
    public static final int RIGHT_UP_CORNER = 1;
    public static final int UP = 0;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public Robot(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
class MovingRobot extends Robot{
    ArrayList<Integer> moves = new ArrayList<Integer>();
    int nextMove;

    public boolean validateNextMove(){
        int checkX = this.getX();
        int checkY = this.getY();
        int checkNext = this.nextMove;
        if(checkX == 0){
            if(checkY == 0){
                if(checkNext  == 2){
                    return true;
                }
                else if(checkNext  == 3){
                    return true;
                }
                else if(checkNext  == 4){
                    return true;
                }
                else
                    return false;
            }
            else if(checkY < 9){
                if(checkNext == 0){
                    return true;
                }
                else if(checkNext == 1){
                    return true;
                }
                else if(checkNext == 2){
                    return true;
                }
                else if(checkNext == 3){
                    return true;
                }
                else if(checkNext == 4){
                    return true;
                }
                else
                    return false;
            }
            else if(checkY == 9){
                if(checkNext == 0){
                    return true;
                }
                else if(checkNext == 1){
                    return true;
                }
                else if(checkNext == 2){
                    return true;
                }
                else {
                    return false;
                }
            }
        }
        else if(checkX < 9){
            if(checkY == 0){
                if(checkNext == 2){
                    return true;
                }
                else if(checkNext == 3){
                    return true;
                }
                else if(checkNext == 4){
                    return true;
                }
                else if(checkNext == 5){
                    return true;
                }
                else if(checkNext == 6){
                    return true;
                }
                else {
                    return false;
                }
            }
            else if(checkY < 9){
                return true;
            }
            else if(checkY == 9){
                if(checkNext == 6){
                    return true;
                }
                else if(checkNext == 7){
                    return true;
                }
                else if(checkNext == 0){
                    return true;
                }
                else if(checkNext == 1){
                    return true;
                }
                else if(checkNext == 2){
                    return true;
                }
                else {
                    return false;
                }
            }
        }
        else if(checkX == 9){
            if(checkY == 0){
                if(checkNext == 6){
                    return true;
                }
                else if(checkNext == 5){
                    return true;
                }
                else if(checkNext == 4){
                    return true;
                }
                else
                    return false;
            }
            else if(checkY < 9){
                if(checkNext == 0){
                    return true;
                }
                else if(checkNext == 7){
                    return true;
                }
                else if(checkNext == 6){
                    return true;
                }
                else if(checkNext == 5){
                    return true;
                }
                else if(checkNext == 4){
                    return true;
                }
                else {
                    return false;
                }
            }
            else if(checkY == 9){
                if(checkNext == 0){
                    return true;
                }
                else if(checkNext == 7){
                    return true;
                }
                else if(checkNext == 6){
                    return true;
                }
                else {
                    return false;
                }
            }
        }
        return true;
    }
    public int generateNextMove(){
        Random gen = new Random();
        int movement = gen.nextInt(8);
        return movement;
    }
    public MovingRobot(int x, int y){
        super(x, y);
    }
    public static boolean sameSlot(Robot r1, Robot r2){
        int x1 = r1.getX();
        int y1 = r1.getY();
        int x2 = r2.getX();
        int y2 = r2.getY();
        if(x1 == x2){
            if(y1 == y2){
                return true;
            }
            else
                return false;
        }
        else
            return false;
    }
    public String printMoves(){
        int size = moves.size();
        String print = "";
        System.out.println("List of Moves: ");
        for(int i = 0; i < size; i++){
            int movePrint = moves.get(i);
            print = print + movePrint + ", ";
        }
        return print;
    }
    public void move(){
        boolean check = false;
        while(check == false) {
            this.nextMove = generateNextMove();
            boolean valid = validateNextMove();
            if(valid == true){
                int currentX = this.getX();
                int currentY = this.getY();
                switch (nextMove){
                    case 4: {
                        int xTemp = currentX;
                        int yTemp = currentY + 1;
                        this.setX(xTemp);
                        this.setY(yTemp);
                        check = true;
                        break;
                    }
                    case 6: {
                        int xTemp = currentX - 1;
                        int yTemp = currentY;
                        this.setX(xTemp);
                        this.setY(yTemp);
                        check = true;
                        break;
                    }
                    case 5: {
                        int xTemp = currentX -1;
                        int yTemp = currentY + 1;
                        this.setX(xTemp);
                        this.setY(yTemp);
                        check = true;
                        break;
                    }
                    case 7:{
                        int xTemp = currentX -1;
                        int yTemp = currentY - 1;
                        this.setX(xTemp);
                        this.setY(yTemp);
                        check = true;
                        break;
                    }
                    case 2:{
                        int xTemp = currentX + 1;
                        int yTemp = currentY;
                        this.setX(xTemp);
                        this.setY(yTemp);
                        check = true;
                        break;
                    }
                    case 3:{
                        int xTemp = currentX + 1;
                        int yTemp = currentY + 1;
                        this.setX(xTemp);
                        this.setY(yTemp);
                        check = true;
                        break;
                    }
                    case 1: {
                        int xTemp = currentX + 1;
                        int yTemp = currentY - 1;
                        this.setX(xTemp);
                        this.setY(yTemp);
                        check = true;
                        break;
                    }
                    case 0:{
                        int xTemp = currentX;
                        int yTemp = currentY - 1;
                        this.setX(xTemp);
                        this.setY(yTemp);
                        check = true;
                        break;
                    }
                    default:{}
                }
            }
            else
                check = false;
        }
        int temp = nextMove;
        moves.add(temp);
    }
    public static void main(String[] args){
        MovingRobot[][] board = new MovingRobot[10][10];
        MovingRobot m1 = new MovingRobot(0,0);
        MovingRobot m2 = new MovingRobot(9, 9);
        boolean check = false;
        while(check == false){
            check = sameSlot(m1,m2);
            int m1X = m1.getX();
            int m1Y = m1.getY();
            board[m1Y][m1X] = m1;
            m1.move();
            int m2X = m2.getX();
            int m2Y = m2.getY();
            board[m2Y][m2X] = m2;
            m2.move();
        }
        int m1X = m1.getX();
        int m1Y = m1.getY();
        System.out.print("The final position was: ");
        System.out.print(m1X);
        System.out.print(",");
        System.out.println(m1Y);
        System.out.print("M1's ");
        String out1 = m1.printMoves();
        System.out.println(out1);
        System.out.print("M2's ");
        String out2 = m2.printMoves();
        System.out.println(out2);
    }

}