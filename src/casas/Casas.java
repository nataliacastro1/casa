package casas;


import java.util.Date;


public class Casas {
 private Date fechadeconstruccion;
 private boolean diferenteszonas;
 private String nombredelaconstructora;
 private int numerodeviviendas;
 private Date fechadefinalizacion;

    public Casas(Date fechadeconstruccion, boolean diferenteszonas, String nombredelaconstructora, int numerodeviviendas, Date fechadefinalizacion) {
        this.fechadeconstruccion = fechadeconstruccion;
        this.diferenteszonas = diferenteszonas;
        this.nombredelaconstructora = nombredelaconstructora;
        this.numerodeviviendas = numerodeviviendas;
        this.fechadefinalizacion = fechadefinalizacion;
    }
 
 
 
    public void inauguracion() {
        fechadeconstruccion = true;
     }
 
    public void sectores(){
        diferenteszonas = true;
    }
     
    public void empresa (){
        nombredelaconstructora = true;
    }
  
    public void saberdelarea (){
        numerodeviviendas += 10 ;
    }
    
    public void finalconstruccion (){
        fechadefinalizacion = true;
    }
    
    }
 
    

