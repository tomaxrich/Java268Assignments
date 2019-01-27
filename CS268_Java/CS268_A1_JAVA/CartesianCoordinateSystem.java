import java.lang.Math;
import java.text.DecimalFormat;

class CartesianCoordinateSystem{
    public double calculateDistance(double x1, double y1, double x2, double y2){
        double xOne = x1;
        double xTwo = x2;
        double yOne = y1;
        double yTwo = y2;
        double xDiff = xTwo - xOne;
        double yDiff = yTwo - yOne;
        double total = Math.pow(xDiff, 2) + Math.pow(yDiff, 2);
        double finalTotal = Math.pow(total, 0.5);
        DecimalFormat df = new DecimalFormat("#.##");
        Double temp = Double.parseDouble(df.format(finalTotal));
        return temp;
    }
    public static void main(String[] args){
        CartesianCoordinateSystem calc = new CartesianCoordinateSystem();
        double temp = calc.calculateDistance(-2,-3,-4,4);
        System.out.println(temp);
    }
}