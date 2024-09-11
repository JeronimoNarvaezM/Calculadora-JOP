
package trabajocalculadora;

import javax.swing.JOptionPane;

public class TrabajoCalculadora {

    public static void main(String[] args) {
        
        // TODO code application logic here
        
        Operaciones operaciones= new Operaciones();
        
        boolean continuar= true;
        
        while(continuar){
             String[] opciones = {"Sumar", "Restar", "Multiplicar", "Dividir", "Salir"};
             String seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione una operacion", "Calculadora", 
                     JOptionPane.QUESTION_MESSAGE,null, opciones, opciones[0]);
            if (seleccion.equals("Salir")){
                continuar= false;
                break;
            }
            
            String num12Str= JOptionPane.showInputDialog(null, "Ingrese el primer numero");
            double numero1= Double.parseDouble(num12Str);
            
            String num22Str= JOptionPane.showInputDialog(null, "Ingrese el segundo numero");
            double numero2= Double.parseDouble(num22Str);
            
            double resultado=0;
            
            try {
                switch(seleccion){
                    case "Sumar":
                        resultado= operaciones.sumar(numero1, numero2);
                        break;
                    case "Restar":
                        resultado= operaciones.restar(numero1, numero2);
                        break;
                    case "Multiplicar":
                        resultado= operaciones.multiplicar(numero1, numero2);
                        break;
                    case "Dividir":
                        resultado= operaciones.dividir(numero1, numero2);
                        break;
                        
                }
                JOptionPane.showMessageDialog(null, "El resultado es: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
            }
            
            catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
