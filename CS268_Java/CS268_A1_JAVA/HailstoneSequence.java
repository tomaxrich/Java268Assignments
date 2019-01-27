
import java.util.*;
class HailstoneSequence{
    public static ArrayList<Integer> getHailstoneSequence(int n){
        ArrayList<Integer> arrli1 = new ArrayList<Integer>();
        int initial = n;
        arrli1.add(initial);
        int carry = 0;
        while(initial != 1){
            int check = initial % 2;
            if(check == 0){
                initial = initial / 2;
                arrli1.add(initial);
                carry++;
            }
            else{
                initial = (initial*3)+1;
                arrli1.add(initial);
                carry++;
            }
        }
        arrli1.add(carry);
        return arrli1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a number");
        int input = sc.nextInt();
        ArrayList<Integer> temp = getHailstoneSequence(input);
        System.out.println(temp);
    }
}