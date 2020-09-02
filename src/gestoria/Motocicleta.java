/*
Atributos:
cantRuedas, cilindrada
Metodos:
CostoTransferencia
IndicarTipo (para saber si es moto, cuatriciclo, triciclo, etc)
 */
package gestoria;


public class Motocicleta extends Vehiculo {
    
    private int cantRuedas, cilindrada;
    
    public Motocicleta()
            
    {
       super();
       cantRuedas = cilindrada = 0;
    
    }

    public int getCantRuedas() {
        return cantRuedas;
    }

    public void setCantRuedas(int cantRuedas) {
        this.cantRuedas = cantRuedas;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    public float calcularCostoTransferencia()
    {
       float transferencia;
       if (cilindrada >= 1000)
       { transferencia = getPrecio()*0.04f;}
       
       else 
       { transferencia = getPrecio()*0.5f + 3500;}
       
       return transferencia;
    
    
    }
    
    public String indicarTipo()
    {
      String tipo;
      switch (cantRuedas)
          
      {
          case 2: tipo = "Motocicleta"; break;
              
          case 3: tipo = "Triciclo"; break;
              
          case 4: tipo = "Cuatriciclo"; break;
              
          default: tipo = "Opcion no valida";    
      
      
      }
    
    
      return tipo;
    }
    
    
} // Fin de clase
