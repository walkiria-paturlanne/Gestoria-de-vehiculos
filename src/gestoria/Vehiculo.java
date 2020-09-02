/*
Consigna:
Atributos String: patente, marca, titular, modelo
int añoPatentamiento, km
float precio
Metodos:
calcularAntiguedad

*/
package gestoria;


public class Vehiculo {
    
    //Defino los atributos
    private String patente, marca, titular, modelo;
    private int añoPatentamiento, km;
    private float precio;
    
    public Vehiculo()
    {
      patente = marca = titular = modelo = "";
      añoPatentamiento = km = 0;
      precio = 0.0f;
      
    
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAñoPatentamiento() {
        return añoPatentamiento;
    }

    public void setAñoPatentamiento(int añoPatentamiento) {
        this.añoPatentamiento = añoPatentamiento;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    public int calcularAntiguedad()
            {
               int añoActual = 2020;
               int antiguedad = añoActual - añoPatentamiento;
               return antiguedad;
            }
    
    
    
} // Fin de la clase 
