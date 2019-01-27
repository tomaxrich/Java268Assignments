class AddressBook {
    private String businessPhone;
    private String cellPhone;
    private String facebookId;
    private String firstName;
    private String homeAddress;
    private String homePhone;
    private String lastName;
    private String middleName;
    private String personalWebSite;
    private String skypeId;

    public AddressBook(String fn, String mn, String ln, String homeAddress1, String businessPhone1, String homePhone1, String cellPhone1, String skypeId1, String facebookId1, String personalWebSite1){
        firstName = fn;
        middleName = mn;
        homeAddress = homeAddress1;
        businessPhone =businessPhone1;
        homePhone = cellPhone1;
        cellPhone = cellPhone1;
        skypeId = skypeId1;
        facebookId = facebookId1;
        personalWebSite = personalWebSite1;
    }
    public AddressBook(String fn){
        firstName = fn;
    }
    public AddressBook(String fn, String mn){
        firstName =fn;
        middleName =mn;
    }
    public AddressBook(String fn, String mn, String ln){
        firstName = fn;
        middleName = mn;
        lastName = ln;
    }
    public static String compareNames(String name1, String name2){
        String nameOne = name1;
        String nameTwo = name2;
        StringBuffer temp = new StringBuffer(nameTwo);
        boolean testResults = nameOne.contentEquals(temp);
        if(testResults == true){
            return "same";
        }
        else{
            return "different";
        }
    }
    public String getBusinessPhone(){
        return businessPhone;
    }
    public String getCellPhone(){
        return cellPhone;
    }
    public String getFacebookId(){
        return facebookId;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getHomeAddress(){
        return homeAddress;
    }
    public String getHomePhone(){
        return homePhone;
    }
    public String getLastName(){
        return lastName;
    }
    public String getMiddleName(){
        return middleName;
    }
    public String getPersonalWebSite(){
        return personalWebSite;
    }
    public String getSkypeId(){
        return skypeId;
    }
    public void setBusinessPhone(String businessPhone1){
        businessPhone = businessPhone1;
    }
    public void setCellPhone(String cellPhone1){
        cellPhone = cellPhone1;
    }
    public void setFacebookId(String facebookId1){
        facebookId = facebookId1;
    }
    public void setFirstName(String firstName1){
        firstName = firstName1;
    }
    public void setHomeAddress(String homeAddress1){
        homeAddress = homeAddress1;
    }
    public void setHomePhone(String homePhone1){
        homePhone = homePhone1;
    }
    public void  setLastName(String lastName1){
        lastName = lastName1;
    }
    public void setMiddleName(String middleName1){
        middleName = middleName1;
    }
    public void setPersonalWebSite(String personalWebSite1){
        personalWebSite = personalWebSite1;
    }
    public void setSkypeId(String skypeId1){
        skypeId = skypeId1;
    }
}

public class BanffMarathonRunner extends AddressBook{
    private int time;
    private int years;

    public BanffMarathonRunner(String fn, String ln, int min, int yr){
        super(fn, ln);
        this.time = min;
        this.years = yr;
    }
    public int getTime(){
        return time;
    }
    public int getYears(){
        return years;
    }
    public static BanffMarathonRunner getFastestRunner(BanffMarathonRunner[] runners){
        int size = runners.length - 1;
        BanffMarathonRunner fast = runners[0];
        BanffMarathonRunner current, temp;
        double timeFast, timeCurrent, timeTemp;
        for(int i = 0; i < size; i++){
            current = runners[i];
            temp = runners[i+1];
            timeFast = fast.getTime();
            timeCurrent = current.getTime();
            timeTemp = temp.getTime();
            if(timeCurrent >= timeTemp){
                if(timeCurrent >= timeFast){
                    fast = current;
                }
            }else{
                if(timeTemp >= timeFast){
                    fast = temp;
                }
            }

        }
        return fast;
    }
    public static BanffMarathonRunner getSecondFastestRunner(BanffMarathonRunner[] runners){
        int size = runners.length - 1;
        BanffMarathonRunner fast = runners[0];
        BanffMarathonRunner second = runners[0];
        BanffMarathonRunner current, temp;
        double timeFast, timeCurrent, timeTemp, timeSecond;
        for(int i = 0; i < size; i++){
            current = runners[i];
            temp = runners[i+1];
            timeFast = fast.getTime();
            timeSecond = second.getTime();
            timeTemp = temp.getTime();
            timeCurrent = current.getTime();
            if(timeCurrent >= timeTemp){
                if(timeCurrent >= timeFast){
                    fast = current;
                }
                else if(timeCurrent >= timeSecond){
                    second = current;
                }
            }else{
                if(timeTemp >= timeFast){
                    fast = temp;
                }
                else if(timeTemp >= timeSecond){
                    second = temp;
                }
            }
        }
        return second;
    }
    public static double getAverageTime(BanffMarathonRunner[] runners){
        int size = runners.length;
        int total = 0;
        for(int i = 0; i < size; i++){
            total = total + runners[i].getTime();
        }
        int temp = total/size;
        double temp1 = (double) temp;
        return temp1;
    }
    public static String getAboveAverageRunners(BanffMarathonRunner[] runners){
        int size = runners.length;
        double benchMark = getAverageTime(runners);
        int bench = (int) benchMark;
        int temp;
        String total = "The Above Average runners are as follows \n";
        String temp1, temp2;
        int temp3;
        for(int i = 0; i < size; i++){
            temp = runners[i].getTime();
            if(temp >= bench){
                temp1 = runners[i].getFirstName();
                temp2 = runners[i].getMiddleName();
                temp3 = runners[i].getYears();
                total += temp1 + " " + temp2 + " " + temp3 + "\n";
            }
        }
        return total;
    }
    public void setTime(int time){
        this.time = time;
    }

    public void setYears(int years) {
        this.years = years;
    }
    public static void main(String[] args){

        BanffMarathonRunner one = new BanffMarathonRunner("Elena","Brandon",341,1);
        one.setHomeAddress("Banff, Alberta");
        BanffMarathonRunner two = new BanffMarathonRunner("Thomas","Molson",273, 2);
        two.setHomeAddress("Banff, Alberta");
        BanffMarathonRunner three = new BanffMarathonRunner("Hamilton", "Winn", 278, 5);
        three.setHomeAddress("Banff, Alberta");
        BanffMarathonRunner four = new BanffMarathonRunner("Suzie", "Sarandin", 329, 7);
        four.setHomeAddress("Banff, Alberta");
        BanffMarathonRunner five = new BanffMarathonRunner("Philip", "Winne", 445, 9);
        five.setHomeAddress("Banff, Alberta");
        BanffMarathonRunner six = new BanffMarathonRunner("Alex", "trebok", 275, 3);
        six.setHomeAddress("Banff, Alberta");
        BanffMarathonRunner seven = new BanffMarathonRunner("Emma", "Pivoto", 275, 4);
        seven.setHomeAddress("Banff, Alberta");
        BanffMarathonRunner eight = new BanffMarathonRunner("John", "Lenthen", 243, 1);
        eight.setHomeAddress("Banff, Alberta");
        BanffMarathonRunner nine = new BanffMarathonRunner("James", "Lean", 334, 1);
        nine.setHomeAddress("Banff, Alberta");
        BanffMarathonRunner ten = new BanffMarathonRunner("Jane", "Ostin", 412, 1);
        ten.setHomeAddress("Banff, Alberta");
        BanffMarathonRunner eleven = new BanffMarathonRunner("Emily", "Car", 393, 4);
        eleven.setHomeAddress("Banff, Alberta");
        BanffMarathonRunner twelve = new BanffMarathonRunner("Daniel", "Hamshire", 299, 4);
        twelve.setHomeAddress("Banff, Alberta");
        BanffMarathonRunner thirteen = new BanffMarathonRunner("Neda", "Bazdar", 343, 3);
        thirteen.setHomeAddress("Banff, Alberta");
        BanffMarathonRunner fourteen = new BanffMarathonRunner("Aaron", "Smith", 317, 6);
        fourteen.setHomeAddress("Banff, Alberta");
        BanffMarathonRunner fifteen = new BanffMarathonRunner("Kate", "Hen", 265, 8);
        fifteen.setHomeAddress("Banff, Alberta");
        BanffMarathonRunner[] finalist;
        finalist = new BanffMarathonRunner[] {one, two, three, four, five, six, seven, eight, eight, nine, ten, eleven, twelve, thirteen, fourteen, fifteen};
        BanffMarathonRunner Fastest = getFastestRunner(finalist);
        String temp1, temp2;
        double temp3;
        temp1 = Fastest.getFirstName();
        temp2 = Fastest.getHomeAddress();
        temp3 = Fastest.getTime();
        BanffMarathonRunner SecondFastest = getSecondFastestRunner(finalist);
        System.out.println("The Fastest Runner is");
        System.out.println(temp1);
        System.out.println(temp2);
        System.out.println(temp3);
        String temp4 = SecondFastest.getFirstName();
        String temp5 = SecondFastest.getHomeAddress();
        double temp6 = SecondFastest.getTime();
        double temp8 = temp3 - temp6;
        String Temp7 = temp4 + " " + temp5 + " " + temp6 + " " + temp8;
        System.out.println("The Second Fastest Runner is");
        System.out.println(Temp7);
        String temp = getAboveAverageRunners(finalist);
        System.out.println(temp);

    }
}