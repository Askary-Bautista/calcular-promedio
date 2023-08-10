
package calcular.promedio;

//Elabore un programa que calcule el promedio de tres calificaciones

import javax.swing.JOptionPane;

//cal_1, cal_2,cal_3
//sumatoria 
//promedio 
public class CalcularPromedio {

    public static void main(String[] args) {
       float cal_1,cal_2,cal_3,sumatoria,promedio;
       
       cal_1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese la primera calificacion"));
       cal_2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese la segunda calificacion"));
       cal_3 = Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese la tercera calificacion"));
       
       sumatoria = cal_1 + cal_2 + cal_3;
       
       promedio = sumatoria/3;
       
       JOptionPane.showMessageDialog(null,"El promedio es: " + promedio);
       
    }
    
}
