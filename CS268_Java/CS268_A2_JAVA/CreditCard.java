import java.util.*;
class CreditCard{

    private int evenSum;
    private int oddSum;
    private int sum;
    private String ccNumber;
    private String company;
    //This comes fourth
    public boolean isDivisibleBy10(){
        int check = (getSum())%10;
        if(check == 0){
            return true;
        }
        else
            return false;
    }
    //This comes sixth
    public boolean isValid(){
        boolean check1 = validateNumber();
        boolean check2 = validateCompany();
        if(check1 == true){
            if(check2 == true){
                return true;
            }
            else{
                return false;
            }
        }
        else
            return false;
    }
    //This comes second
    public boolean validateCompany(){
        char check = ccNumber.charAt(0);
        int checkCont = Character.getNumericValue(check);
        if(checkCont == 4){
            this.company = "Visa";
            return true;
        }
        else if(checkCont == 5){
            this.company = "Master";
            return true;
        }
        else if(checkCont == 3){
            char check3 = ccNumber.charAt(1);
            int check3Cont = Character.getNumericValue(check3);
            if(check3Cont == 7) {
                this.company = "American Express";
                return true;
            }
            else{
                return false;
            }
        }
        else if(checkCont == 6){
            this.company = "Discover";
            return true;
        }
        else{
            return false;
        }

    }
    //Start here
    public boolean validateLength(){
        String check1 = getCcNumber();
        int check = check1.length();
        if(check > 13){
            if(check < 16){
                return true;
            }
            else{
                return false;
            }
        }
        else
            return false;
    }
    //This comes fifth
    public boolean validateNumber(){
        boolean check1 = validateLength();
        boolean check2 = validateSums();
        if(check1 == true){
            if(check2 == true){
                return true;
            }
            else{
                return false;
            }
        }
        else
            return false;
    }
    //This comes third
    public boolean validateSums(){
        int size = ccNumber.length();
        int tempEven = 0;
        //even sum
        for(int i = 0;i < size; i++){
            char check = ccNumber.charAt(i);
            int checkCont = Character.getNumericValue(check);
            int tempSum = checkCont * 2;
            if(tempSum > 9){
                String tempString = Integer.toString(tempSum);
                char tempChar1 = tempString.charAt(0);
                int index1 = Character.getNumericValue(tempChar1);
                char tempChar2 = tempString.charAt(1);
                int index2 = Character.getNumericValue(tempChar2);
                tempSum = index1 + index2;
            }
            tempEven = tempEven + tempSum;
            i++;
        }
        evenSum = tempEven;
        //odd sum
        int tempOdd = 0;
        for(int i = 1;i < size; i++){
            char check = ccNumber.charAt(i);
            int checkCont = Character.getNumericValue(check);
            tempOdd = tempOdd + checkCont;
            i++;
        }
        oddSum = tempOdd;
        sum = evenSum + oddSum;
        boolean cHeck = isDivisibleBy10();
        if(cHeck == true){
            return true;
        }
        else{
            return false;
        }
    }
    public CreditCard(String num){
        ccNumber = num;
        validateCompany();
    }
    public int getEvenSum(){
        return evenSum;
    }
    public int getOddSum(){
        return oddSum;
    }
    public int getSum(){
        return sum;
    }
    public String getCcNumber(){
        return ccNumber;
    }
    public String getCompany() {
        return company;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a Credit Card Number: ");
        String input = sc.nextLine();

        CreditCard c1 = new CreditCard(input);
        boolean check = c1.isValid();
        if (check == true) {
            String name = c1.getCompany();
            System.out.println(name);
            name = c1.getCcNumber();
            System.out.println(name);
        }
        else{
            System.out.println("The Card you have entered is Invalid");
        }
    }
}