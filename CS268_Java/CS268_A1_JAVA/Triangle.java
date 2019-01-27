import java.lang.Math;
class Triangle{
    private boolean rightTriangle;
    private double a;
    private double b;
    private double c;

    public boolean isRightTriangle(){
        double Eh = getA();
        double Bee = getB();
        double Cee = getC();
        double temp1 = Math.pow(Eh, 2);
        double temp2 = Math.pow(Bee, 2);
        double temp3 = temp1 + temp2;
        double temp4 = Math.pow(temp3, 0.5);
        if( c == temp4){
            return true;
        }else {
            return false;
        }
    }
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }
    public Triangle(double a, double b, double c){
        a = a;
        b = b;
        c = c;
    }
    public static double calc(double a, double c){
        double Eh = a;
        double Cee = c;
        double temp1 = Math.pow(Eh, 2);
        double temp2 = Math.pow(Cee, 2);
        double temp3 = temp2 - temp1;
        double temp4 = Math.pow(temp3, 0.5);
        return  temp4;
    }
    public static void main(String[] args){
        double temp1 = calc(48, 80);
        double temp2 = calc(84, 91);
        Triangle t1 = new Triangle(45, 55, 75);
        Triangle t2 = new Triangle(28 , 45, 53);
        boolean check1 = t1.isRightTriangle();
        boolean check2 = t2.isRightTriangle();
        System.out.println("The following two numbers are the calculated values for the respective c values");
        System.out.println(temp1);
        System.out.println(temp2);
        System.out.println("The following true or false values are for whether Triangle A and Triangle B are Right Angle Triangles");
        System.out.println(check1);
        System.out.println(check2);
    }
}