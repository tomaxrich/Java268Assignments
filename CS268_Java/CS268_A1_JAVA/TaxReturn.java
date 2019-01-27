import java.util.Scanner;
public class TaxReturn
{
    /**
     Constructs a TaxReturn object for a given income and
     marital status, and computes the tax.
     @param anIncome the taxpayer income
     @param aStatus either SINGLE or MARRIED
     */
    public TaxReturn(double anIncome, int aStatus)
    {
        income = anIncome;
        status = aStatus;
    }
    public double getTax()
    {
        double tax = 0;
        if (status == SINGLE)
        {
            if (income <= SINGLE_BRACKET1) {
                tax = RATE1 * income;
            }
            else if (income <= SINGLE_BRACKET2) {
                tax = RATE1 * SINGLE_BRACKET1
                        + RATE2 * (income - SINGLE_BRACKET1);
            }
            else if (income <= SINGLE_BRACKET3) {
                tax = RATE1 * SINGLE_BRACKET1
                        + RATE2 * (SINGLE_BRACKET2 - SINGLE_BRACKET1)
                        + RATE3 * (income - SINGLE_BRACKET2);
            }
            else{
                tax = RATE1 *SINGLE_BRACKET1
                        + RATE2 * (SINGLE_BRACKET2 - SINGLE_BRACKET1)
                        + RATE3 * (SINGLE_BRACKET3 - SINGLE_BRACKET2)
                        + RATE4 * (income - 150000);
            }
        }
        else if (status == SINGLE_PARENT)
        {
            System.out.println("Please Enter Number of Children: ");
            Scanner tempInput = new Scanner(System.in);
            int response = tempInput.nextInt();
            int childs = response *5000;
            income = income - childs;
            if (income <= SINGLE_BRACKET1)
                tax = RATE1 * income;
            else if (income <= SINGLE_BRACKET2)
                tax = RATE1 * SINGLE_BRACKET1
                        + RATE2 * (income - SINGLE_BRACKET1);
            else
                tax = RATE1 * SINGLE_BRACKET1
                        + RATE2 * (SINGLE_BRACKET2 - SINGLE_BRACKET1)
                        + RATE3 * (income - SINGLE_BRACKET2);
        }
        else if (status == MARRIED)
        {
            if (income <= MARRIED_BRACKET1) {
                tax = RATE1 * income;
            }
            else if (income <= MARRIED_BRACKET2) {
                    tax = RATE1 * MARRIED_BRACKET1
                            + RATE2 * (income - MARRIED_BRACKET1);
                }
                else if(income <= MARRIED_BRACKET3) {
                    tax = RATE1 * MARRIED_BRACKET1
                            + RATE2 * (MARRIED_BRACKET2 - MARRIED_BRACKET1)
                            + RATE3 * (income - MARRIED_BRACKET2);
                }
                else {
                    tax = RATE1 * MARRIED_BRACKET1
                            + RATE2 * (MARRIED_BRACKET2 - MARRIED_BRACKET1)
                            + RATE3 * (MARRIED_BRACKET3 - MARRIED_BRACKET2)
                            + RATE5 * (income - 200000);
                }
        }
        else if(status == UNKOWN){
            tax = 0.33 * income;
        }
        return tax;
    }
    public static final int SINGLE = 1;
    public static final int MARRIED = 2;
    public static final int SINGLE_PARENT = 3;
    public static final int UNKOWN = 4;
    private static final double RATE1 = 0.15;
    private static final double RATE2 = 0.28;
    private static final double RATE3 = 0.31;
    private static final double RATE4 = 0.25;
    private static final double RATE5 = 0.35;
    private static final double SINGLE_BRACKET1 = 21450;
    private static final double SINGLE_BRACKET2 = 51900;
    private static final double SINGLE_BRACKET3 = 249999;
    private static final double MARRIED_BRACKET1 = 35800;
    private static final double MARRIED_BRACKET2 = 86500;
    private static final double MARRIED_BRACKET3 = 349999;
    private double income;
    private int status;

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your income: ");
        double income = in.nextDouble();
        System.out.print("Enter S (single) or M (married) or P (Single Parent) or U (Unkown): ");
        String input = in.next();
        int status = 0;
        if (input.equalsIgnoreCase("S"))
            status = TaxReturn.SINGLE;
        else if (input.equalsIgnoreCase("M"))
            status = TaxReturn.MARRIED;
        else if(input.equalsIgnoreCase("P"))
            status = TaxReturn.SINGLE_PARENT;
        else if(input.equalsIgnoreCase("U"))
            status = TaxReturn.UNKOWN;
        else
        {
            System.out.println("Bad input.");
            return;
        }
        TaxReturn aTaxReturn = new TaxReturn(income, status);
        System.out.println("The tax is " + aTaxReturn.getTax());
    }
}