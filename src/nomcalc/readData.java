package nomcalc;

public class readData {
    private double montlySalary, workedDays, comission, order;
    private int diurnExHour, nocturnExHour, sundayExHour;

    public readData(double montlySalary, double workedDays, int diurnExHour, int nocturnExHour, int sundayExHour, double comission, double order) {
        this.montlySalary = montlySalary;
        this.workedDays = workedDays;
        this.diurnExHour = diurnExHour;
        this.nocturnExHour = nocturnExHour;
        this.sundayExHour = sundayExHour;
        this.comission = comission;
        this.order = order;
    }

    public double getMontlySalary() {
        return montlySalary;
    }

    public double getWorkedDays() {
        return workedDays;
    }

    public int getDiurnExHour() {
        return diurnExHour;
    }

    public int getNocturnExHour() {
        return nocturnExHour;
    }

    public int getSundayExHour() {
        return sundayExHour;
    }

    public double getComission() {
        return comission;
    }

    public double getOrder() {
        return order;
    }
}
