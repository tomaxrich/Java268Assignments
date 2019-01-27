import java.util.*;
class Number{
    public static ArrayList<String> iterate(){
        ArrayList<String> rere = new ArrayList<String>();
        for(int i = 1; i < 114; i++){
            String temp = "";
            String temp1 = Integer.toString(i);
            boolean check1, check2, check3,check4;
            check1 = isOdd(i);
            check2 = isDivisibleBy5(i);
            check3 = isDivisibleBy7((i+(i+1)));
            check4 = isPrime(i);
            if(check1 == true){
                temp = temp +" is odd,";
            }
            if(check2 == true){
                temp = temp +" hi five,";
            }
            if(check3 == true){
                temp = temp +" wow,";
            }
            if(check4 == true){
                temp = temp +" prime,";
            }
            temp1 = temp1 + temp + "\n";
            rere.add(temp1);
        }
        return rere;
    }
    public static boolean isDivisibleBy5(int n){
        int check = n%5;
        if(check == 0){
            return true;
        }
        else
            return false;
    }
    public static boolean isDivisibleBy7(int n){
        int check = n%7;
        if(check == 0){
            return true;
        }
        else
            return false;
    }
    public static boolean isOdd(int n){
        int check = n%2;
        if(check == 0){
            return false;
        }
        else
            return true;
    }
    public static boolean isPrime(int n){
        int check1 = n%2;
        int check2 = n%3;
        if(n == 2){
            return true;
        }
        else if(n == 3){
            return true;
        }
        else if(check1 == 0 ){
            return false;
        }
        else if(check2 == 0){
            return false;
        }
        int i = 5;
        int w = 2;
        int k;
        while((i * i) <= n){
            k = n%i;
            if(k == 0){
                return false;
            }
            i += w;
            w = 6-w;
        }
        return true;
    }
    public static void main(String[] args){
        ArrayList<String> play = iterate();
        System.out.println(play);
    }
}