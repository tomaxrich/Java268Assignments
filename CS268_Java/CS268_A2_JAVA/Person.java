import java.util.*;
class Person{
    private double bmi;
    private double height;
    private double weight;
    private String category;
    private String name;

    public double getBMI(){
        return bmi;
    }
    public double getHeight(){
        return height;
    }
    public double getWeight(){
        return weight;
    }
    public Person(String n, double w, double h){
        name = n;
        weight = w;
        height = h;
        double tempBmi = ((this.weight)*703)/(Math.pow(this.height, 2));
        category = getCategory(tempBmi);
        bmi = tempBmi;
    }
    public String getCategory(double bmi){
        String cat = "";
        if(bmi < 18.5){
            cat = "Underweight";
        }
        else if(bmi < 25){
            cat = "Normal";
        }
        else if(bmi <= 3){
            cat = "Overweight";
        }
        else if(bmi > 30){
            cat = "Obese";
        }
        return cat;
    }
    public String getCategory(){
        return category;
    }
    public String getName() {
        return name;
    }
    public void setBmi(double bmi){
        bmi = bmi;
    }
    public void setHeight(double height){
        height = height;
    }
    public void setName(String name){
        name = name;
    }
    public void setWeight(double weight){
        weight = weight;
    }
    public static Person get(String nm, ArrayList<Person> lt){
        String check = nm;
        int size = lt.size();
        int match = 0;
        int i = 0;
        Person temp = lt.get(0);
        while(match == 0){
            if(i == size){
                System.out.println("no match, returning first person on list");
                temp = lt.get(0);
                match = 1;
            }
            else {
                temp = lt.get(i);
                String check2 = temp.getName();
                if(check2 == check) {
                    System.out.println("Match found, returning person on list");
                    temp = lt.get(i);
                    match = 1;
                }
                else {
                    i++;
                }
            }
        }
        return temp;
    }
    public void set(ArrayList<Person> lt){
        lt.add(this);
    }
    public static void main(String[] args){
        ArrayList<Person> list = new ArrayList<Person>();
        Person p1 = new Person("Andrew",125.5, 55.1);
        Person p2 = new Person("Boyd", 150.0, 67);
        Person p3 = new Person("Cathy", 135, 72.3);
        Person p4 = new Person("Donna", 190, 64);
        p1.set(list);
        p2.set(list);
        p3.set(list);
        p4.set(list);
        Person temp = get("Donna", list);
        String check = temp.getName();
        System.out.println(check);
        temp = get("Cathy", list);
        check = temp.getName();
        System.out.println(check);
        temp = get("Boyd", list);
        check = temp.getName();
        System.out.println(check);
        temp = get("Andrew", list);
        check = temp.getName();
        System.out.println(check);
        temp = get("Steve", list);
        check = temp.getName();
        System.out.println(check);
        temp = get("0000", list);
        check = temp.getName();
        System.out.println(check);
    }
}