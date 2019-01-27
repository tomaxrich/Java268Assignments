public class AddressBook {
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
    public static void main(String[] args) {

        AddressBook firstTest = new AddressBook("Thomas");
        AddressBook secondTest = new AddressBook("Sara","Penny");
        AddressBook thirdTest = new AddressBook("Paula","Christine","Richardson");
        AddressBook fourthTest = new AddressBook("Andrew","Thomas", "Richardson", "The Moon","333-403-3560","456-877-9999","777-888-9090","theRageMachine","Andrew T Richardson","www.getsome.org");
        firstTest.setMiddleName("Maxwell");
        firstTest.setLastName("Rihcardson");
        firstTest.setBusinessPhone("403-222-2222");
        firstTest.setCellPhone("333-200-9999");
        firstTest.setFacebookId("Thomas M Richardson");
        firstTest.setHomeAddress("Tartarus");
        firstTest.setHomePhone("888-999-0101");
        firstTest.setPersonalWebSite("www.yeswecan.org");
        firstTest.setSkypeId("whoswho");
        String temp = firstTest.getBusinessPhone();
        System.out.println(temp);
        temp = firstTest.getCellPhone();
        System.out.println(temp);
        temp = firstTest.getFacebookId();
        System.out.println(temp);
        temp = firstTest.getFirstName();
        System.out.println(temp);
        temp = firstTest.getHomeAddress();
        System.out.println(temp);
        temp = firstTest.getHomePhone();
        System.out.println(temp);
        temp = firstTest.getLastName();
        System.out.println(temp);
        temp = firstTest.getMiddleName();
        System.out.println(temp);
        temp = firstTest.getPersonalWebSite();
        System.out.println(temp);
        temp = firstTest.getSkypeId();
        System.out.println(temp);

        temp = secondTest.getFirstName();
        System.out.println(temp);
        temp = secondTest.getMiddleName();
        System.out.println(temp);

        temp = thirdTest.getFirstName();
        System.out.println(temp);
        temp = thirdTest.getMiddleName();
        System.out.println(temp);
        temp = thirdTest.getLastName();
        System.out.println(temp);

        temp = fourthTest.getBusinessPhone();
        System.out.println(temp);
        temp = fourthTest.getCellPhone();
        System.out.println(temp);
        temp = fourthTest.getFacebookId();
        System.out.println(temp);
        temp = fourthTest.getFirstName();
        System.out.println(temp);
        temp = fourthTest.getHomeAddress();
        System.out.println(temp);
        temp = fourthTest.getHomePhone();
        System.out.println(temp);
        temp = fourthTest.getLastName();
        System.out.println(temp);
        temp = fourthTest.getMiddleName();
        System.out.println(temp);
        temp = fourthTest.getPersonalWebSite();
        System.out.println(temp);
        temp = fourthTest.getSkypeId();
        System.out.println(temp);

        String results = compareNames("Thomas M Richardson", "Andrew T Richardson");
        System.out.println(results);
        results = compareNames("6000600006000", "Thomas M Richardson");
        System.out.println(results);
        results = compareNames("Thomas M Richardson", "Thomas Richardson");
        System.out.println(results);
        results = compareNames("Thomas M Richardson", "Thomas M Richardson");
        System.out.println(results);
    }
}