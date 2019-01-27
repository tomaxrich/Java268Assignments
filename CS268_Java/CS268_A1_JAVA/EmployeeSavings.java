import java.util.Random;
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

public class EmployeeSavings extends AddressBook{
    private double accountValue;
    private double[] monthlyInterests;
    private double[] monthlySavings;
    public static final double ANNUAL_INTEREST_RATE = 0.05;

    public double getAccountValue(){
        return accountValue;
    }
    public double[] calculateInterests(){
        double[] temp = new double[12];
        for(int i = 0; i < 12; i++){
            temp[i] = monthlySavings[i]*1.0047;
        }
        return temp;
    }
    public double[] generateMonthlySavings(){
        Random rand1 = new Random();
        Random rand2 = new Random();
        int n = rand1.nextInt(120);
        int j = rand2.nextInt(80);
        int k = rand1.nextInt(5);
        int bench = (n + j)*k;
        double[] temp = new double[12];
        if(bench > 800){
            bench = bench - 150;
        }
        else if(bench < 100){
            bench = bench + 150;
        }
        for(int i = 0; i < 12; i++){
            temp[i] = bench;
        }
        return temp;
    }
    public double[] getMonthlyInterests(){
        return monthlyInterests;
    }
    public double[] getMonthlySavings(){
        return monthlySavings;
    }
    public  EmployeeSavings(String fn, String ln){
        super(fn, ln);
        monthlySavings = generateMonthlySavings();
        monthlyInterests = calculateInterests();
    }
    public EmployeeSavings(String fn, String ln, double[] d1, double[] d2){
        super(fn, ln);
        monthlySavings = d1;
        monthlyInterests = d2;
    }
    public static String getReport(EmployeeSavings[] arr){
        int size = arr.length;
        double[] account = new double[12];
        String[] fun = new String[16];
        for(int i = 0; i < size; i++){
            double total = 0;
            account = arr[i].getMonthlyInterests();
            for(int j = 0; j < 12; j++){
                arr[i].accountValue += account[j];
            }
            String temp1 = arr[i].getFirstName();
            double temp2 = arr[i].getAccountValue();
            temp1 +=  " " + temp2 + "\n";
            fun[i] = temp1;
        }
        String final1 = "";
        for(int i = 0; i < size; i++){
            final1 = final1 + fun[i];
        }
        return final1;
    }
    public static void main(String[] args){
        EmployeeSavings one = new EmployeeSavings("Elena","Brandon");
        EmployeeSavings two = new EmployeeSavings("Thomas","Molson");
        EmployeeSavings three = new EmployeeSavings("Hamilton", "Winn");
        EmployeeSavings four = new EmployeeSavings("Suzie", "Sarandin");
        EmployeeSavings five = new EmployeeSavings("Philip", "Winne");
        EmployeeSavings six = new EmployeeSavings("Alex", "trebok");
        EmployeeSavings seven = new EmployeeSavings("Emma", "Pivoto");
        EmployeeSavings eight = new EmployeeSavings("John", "Lenthen");
        EmployeeSavings nine = new EmployeeSavings("James", "Lean");
        EmployeeSavings ten = new EmployeeSavings("Jane", "Ostin");
        EmployeeSavings eleven = new EmployeeSavings("Emily", "Car");
        EmployeeSavings twelve = new EmployeeSavings("Daniel", "Hamshire");
        EmployeeSavings thirteen = new EmployeeSavings("Neda", "Bazdar");
        EmployeeSavings fourteen = new EmployeeSavings("Aaron", "Smith");
        EmployeeSavings fifteen = new EmployeeSavings("Kate", "Hen");
        EmployeeSavings[] finalist;
        finalist = new EmployeeSavings[] {one, two, three, four, five, six, seven, eight, eight, nine, ten, eleven, twelve, thirteen, fourteen, fifteen};

        String rep = getReport(finalist);
        System.out.println(rep);
    }
}