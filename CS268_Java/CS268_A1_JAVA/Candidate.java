import java.util.*;

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

class Candidate extends AddressBook{
    private boolean innovation;
    private double grade;
    private double regulation;
    private String communication;

    public boolean isInnovative(){
        return innovation;
    }
    public Candidate(String fn, String ln, double grade, String comm, boolean innov, double reg){
        super(fn, ln);
        grade = grade;
        communication = comm;
        innovation = innov;
        regulation = reg;
    }
    public double getGrade(){
        return grade;
    }
    public double getRegulation(){
        return regulation;
    }
    public static  ArrayList<Candidate> getEligibleCandidates(Candidate[] cands){
        int size = cands.length;
        Candidate[] hereWeGo = new Candidate[15];
        int j = 0;
        for(int i = 0; i < size; i++){
            double check1 = cands[i].getGrade();
            double check2 = cands[i].getRegulation();
            boolean check3 = cands[i].isInnovative();
            String check4 = cands[i].getCommunication();
            if(check1 >= 85){
                hereWeGo[j] =cands[i];
                j++;
            }
            else if(check2 >= 0.5){
                if(check4 != "poor"){
                    hereWeGo[j] = cands[i];
                    j++;
                }
            }
            else if(check4 == "poor") {
                if (check3 == true) {
                    hereWeGo[j] = cands[i];
                    j++;
                }
            }
        }
        ArrayList<Candidate> yes = new ArrayList<Candidate>(Arrays.asList(hereWeGo));
        return yes;
    }
    public String getCommunication(){
        return communication;
    }
    public void setCommunication(String comm){
        communication = comm;
    }
    public void setGrade(double grade){
        grade = grade;
    }
    public void setInnovation(boolean innov){
        innovation = innov;
    }
    public void setRegulation(double reg){
        regulation = reg;
    }
    public static void main(String[] args){
        Candidate one = new Candidate("Elena","Brandon", 82.30, "poor", true, 0.5);
        Candidate two = new Candidate("Thomas","Molson",85.10, "poor", false,1.0);
        Candidate three = new Candidate("Hamilton", "Winn",77.77, "average", false,0.8);
        Candidate four = new Candidate("Suzie", "Sarandin", 69.93, "average", false, 0.0);
        Candidate five = new Candidate("Philip", "Winne", 93.03, "average", true, 1.0);
        Candidate six = new Candidate("Alex", "trebok", 88.61,"poor", true, 0.7);
        Candidate seven = new Candidate("Emma", "Pivoto", 55.99, "excellent", false, 0.8);
        Candidate eight = new Candidate("John", "Lenthen", 87.49, "excellent", true, 0.9);
        Candidate nine = new Candidate("James", "Lean", 88.00, "excellent", false, 0.5);
        Candidate ten = new Candidate("Jane", "Ostin", 91.20, "average", true, 0.6);
        Candidate eleven = new Candidate("Emily", "Car", 66.79, "excellent", false, 0.3);
        Candidate twelve = new Candidate("Daniel", "Hamshire", 76.65, "average", true, 0.2);
        Candidate thirteen = new Candidate("Neda", "Bazdar", 55.89, "excellent", true, 0.5);
        Candidate fourteen = new Candidate("Aaron", "Smith", 90.01, "excellent", false, 0.3);
        Candidate fifteen = new Candidate("Kate", "Hen", 87.90, "poor", false, 0.8);
        Candidate[] finalist;
        finalist = new Candidate[] {one, two, three, four, five, six, seven, eight, eight, nine, ten, eleven, twelve, thirteen, fourteen, fifteen};

        ArrayList<Candidate> finished;
        finished = new ArrayList<Candidate>(getEligibleCandidates(finalist));
        Candidate[] comeOn = finished.toArray(new Candidate[finished.size()]);
        int check = comeOn.length;
        try {
            for (int i = 0; i < check; i++) {
                System.out.println(comeOn[i].getFirstName());
            }
        }
        catch (NullPointerException nope){}
    }
}