/*
Atributos:
int cantEjes, capacidadCarga;
Metodo:
costo de transferencia
*/
package gestoria;


public class Camion extends Vehiculo {
    
    private int cantEjes, capacidadCarga;
    
    
    public Camion()
    {
      super();
      cantEjes = capacidadCarga = 0;
    }

    public int getCantEjes() {
        return cantEjes;
    }

    public void setCantEjes(int cantEjes) {
        this.cantEjes = cantEjes;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }
    
    public float calcularCostoTransferencia()
            
    {
        float transferencia;
        
        if ( cantEjes >= 4 )
            
        { transferencia = getPrecio()*0.04f;}
    
        else { transferencia = getPrecio()*0.05f;}
        
        if (capacidadCarga >= 10000)
            
        { transferencia = transferencia + 30000;}
    
        return transferencia;   
    }
    
    
} //Fin de clase
