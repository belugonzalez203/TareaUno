package Tarea1Aux;


/**
 * Una empresa de envios de paquetes requiere un programa:
 * Para enviar los paquetes necesita saber el peso del paquete para 
 * calcular el precio de envío en Bs por cada kg del paquete.
 * Tambien requiere saber el volumen del paquete, siendo una caja 
 * rectangular.
 * 
 * @author (Carmen Belen Gonzalez Galvez) 
 * @version (14-04-21)
 */
public class EmpresaPaqueteria{
    
    double pesoCaja;
    int largoCaja;
    int anchoCaja;
    int altoCaja;
    
    EmpresaPaqueteria(int largoCaja, int anchoCaja, int altoCaja){
        this.largoCaja = largoCaja;
        this.anchoCaja = anchoCaja;
        this.altoCaja = altoCaja;
    }
    
    double CalcularVolumen(){
        int volumenCaja;
        volumenCaja = largoCaja * anchoCaja * altoCaja;
        return volumenCaja;
    }
    
    double PrecioEnvio(double pesoCaja){
        this.pesoCaja = pesoCaja;
        double precioEnvio;
        precioEnvio = 5 * pesoCaja;
        return precioEnvio;
    }
    
    public void setPesoCaja(double pesoCaja){
        this.pesoCaja = pesoCaja;
    }
    
    public double getPesoCaja(){
        return pesoCaja;
    }
    
    public void setLargoCaja(int largoCaja){
        this.largoCaja = largoCaja;
    }
    
    public double getLargoCaja(){
        return largoCaja;
    }
    
    public void setAnchoCajaPesoCaja(int anchoCaja){
        this.anchoCaja = anchoCaja;
    }
    
    public double getAnchoCaja(){
        return anchoCaja;
    }
    
    public void setAltoCaja(int altoCaja){
        this.altoCaja = altoCaja;
    }
    
    public double getAltoCaja(){
        return altoCaja;
    }
}
