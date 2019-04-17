package nomcalc;

public class calcData {

    public double totalSalary(double montlySalary, double workedDays) {
        return (montlySalary*workedDays)/30;
    }

    public double totEarned(double totSalary, double comission, double totExHours) {
        return totSalary + comission + totExHours;
    }

    public double netEarned (double totEarned, double totDeducted){
        return totEarned-totDeducted;
    }

    public static class deducted {
        double order;
        double healt;
        double pension;
        double laborUnion;

        deducted(double totEarned, double order) {
            healt = totEarned * 0.08;
            pension = totEarned * 0.04;
            laborUnion = totEarned * 0.02;
            this.order = order;
        }

        public double getHealt() {
            return healt;
        }

        public double getPension() {
            return pension;
        }

        public double getLaborUnion() {
            return laborUnion;
        }

        public double getOrder() {
            return order;
        }

        public double getTotDeducted () {
            return  order + healt + pension + laborUnion;
        }
    }

    public static class exHours {
        double valDiurnExHour, valNocturnExHour, valSundayExHour;
        exHours(int diurnExHour, int nocturnExHour, int sundayExHour) {
            valDiurnExHour = diurnExHour * 1500;
            valNocturnExHour = nocturnExHour * 2000;
            valSundayExHour = sundayExHour * 2500;
        }

        public double getValDiurnExHour() {
            return valDiurnExHour;
        }

        public double getValNocturnExHour() {
            return valNocturnExHour;
        }

        public double getValSundayExHour() {
            return valSundayExHour;
        }

        public double getTotExHours () {
            return valDiurnExHour + valNocturnExHour + valSundayExHour;
        }
    }
}
