public class BonusOnSavings{
    public double computeBonus(double commitment, double q1, double q2, double q3, double q4){
        double commitmentValue = commitment;
        double annualMin = 12 * commitmentValue;
        double quarterMin = 3 * commitmentValue;
        double firstQuarter = commitmentValue - q1;
        double secondQuarter = commitmentValue - q2;
        double thirdQuarter = commitmentValue - q3;
        double fourthQuarter = commitmentValue - q4;
        double actualAnnualSavings = firstQuarter + secondQuarter + thirdQuarter + fourthQuarter;
        double quarterBonus1, quarterBonus2, quarterBonus3, quarterBonus4, annualBonus, totalBonus;
        if (firstQuarter >= quarterMin){
            quarterBonus1 = firstQuarter * 0.03;
        } else{
            quarterBonus1 = 0;
        }
        if (secondQuarter >= quarterMin){
            quarterBonus2 = secondQuarter * 0.03;
        } else{
            quarterBonus2 = 0;
        }
        if (thirdQuarter >= quarterMin){
            quarterBonus3 = thirdQuarter * 0.03;
        } else{
            quarterBonus3 = 0;
        }
        if (fourthQuarter >= quarterMin) {
            quarterBonus4 = fourthQuarter * 0.03;
        } else{
            quarterBonus4 = 0;
        }
        if (actualAnnualSavings >= annualMin) {
            double temp = annualMin * 1.25;
            if(actualAnnualSavings >= temp){
                double temp2 = actualAnnualSavings - annualMin;
                annualBonus = temp2 + (actualAnnualSavings * 0.05);
            }
            else{
                annualBonus = actualAnnualSavings * 0.05;
            }
        } else {
          annualBonus = 0;
        }
        totalBonus = quarterBonus1 + quarterBonus2 + quarterBonus3 + quarterBonus4 + annualBonus;
        return totalBonus;
    }

    public static void main(String[] args){
        BonusOnSavings employee1 = new BonusOnSavings();
        BonusOnSavings employee2 = new BonusOnSavings();
        double temp = employee1.computeBonus(2000, 5000, 7000, 4000, 8000);
        System.out.println(temp);
        temp = employee2.computeBonus(3000, 6000, 9000, 10000, 17000);
        System.out.println(temp);
    }
}