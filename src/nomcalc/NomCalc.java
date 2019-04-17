package nomcalc;

import javax.swing.JOptionPane;
import java.util.List;

public class NomCalc {

    public static void main(String[] args) {

        setInputData inputData = new setInputData();
        calcData calc = new calcData();

        if (JOptionPane.showConfirmDialog(null,"¿Desea ejecutar la nómina?\nPresione no para salir") == 0) {
            try {
                readData read = new readData(inputData.Double("Digite el salario mensual"), inputData.Double("Digite los días laborados"), inputData.Integer("Digite las horas extras diurnas"), inputData.Integer("Digite las horas extras nocturnas"), inputData.Integer("Digite las horas extras dominicales"), inputData.Double("Digite comisiones"), inputData.Double("Ingrese la libranza a deducir"));

                calcData.exHours exHours = new calcData.exHours(read.getDiurnExHour(), read.getNocturnExHour(), read.getSundayExHour());
                double totEarned = calc.totEarned(calc.totalSalary(read.getMontlySalary(), read.getWorkedDays()), read.getComission(), exHours.getTotExHours());
                calcData.deducted deducted = new calcData.deducted(totEarned, read.getOrder());
                double netEarned = calc.netEarned(totEarned, deducted.getTotDeducted());

                printData printData = new printData();
                printData.show("Se ha ganado: " + netEarned);

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Gracias por usar NomCalc");
        }
    }
}
