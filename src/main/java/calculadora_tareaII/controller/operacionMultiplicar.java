
package calculadora_tareaII.controller;

/**
 *
 * @author Audias Guevara
 */
public class operacionMultiplicar implements operaciones{

    @Override
    public double calcular(double n1, double n2) {
      double resultado = 0; 
      
      resultado = n1 * n2;
      
      return resultado;
    }
    
}
