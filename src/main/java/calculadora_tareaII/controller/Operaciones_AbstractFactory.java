
package calculadora_tareaII.controller;

/**
 *
 * @author Audias Guevara
 */
public interface Operaciones_AbstractFactory {
   
    operaciones efectuarSuma(); 
   
   operaciones efectuarResta();
   
   operaciones efectuarMultiplicar();
   
   operaciones efectuarDividir();
}
