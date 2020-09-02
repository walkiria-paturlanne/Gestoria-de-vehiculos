/*
Atributos:
String color
int cantPuertas
Metodos:
costoTransferencia , para los autos sera el %5 del precio si 
el auto tiene menos de 10 años, si tiene mas sera del %3
 */
package gestoria;


public class Automovil extends Vehiculo {
    
    private String color;
    private int cantPuertas;
    
    
    public Automovil()
    {
    
        super();
        color = "";
        cantPuertas = 0;
    
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }
    
    public float calcularTransferencia()
    {
         float transferencia;
         if (calcularAntiguedad() <= 10)
         { transferencia = getPrecio() * 0.05f;}
         
         
     else
         {
          transferencia = getPrecio()*0.03f;

         }
         return transferencia;
    
    }
    
    
} // Fin de clase
