
package casas;

public class rural extends casa{
    
    private int cantidadarea;
    private boolean contaminacion;
    private int numerodepisos;

    public rural(int cantidadarea, boolean contaminacion, int numerodepisos) {
        this.cantidadarea = cantidadarea;
        this.contaminacion = contaminacion;
        this.numerodepisos = numerodepisos;
    }
    public void limpiarzona(){
        this.contaminacion = true;
    }
            
    public void limpiarzona(int gasto){
        this.contaminacion = false;
        this.numerodepisos += gasto;
    }
            
    public int getcantidadarea(){
        return cantidadarea;
     }
    
    public void cantidadarea(int cantidadarea){
        this.cantidadarea = cantidadarea;
    }

    public boolean isContaminacion() {
        return contaminacion;
    }

    public void setContaminacion(boolean contaminacion) {
        this.contaminacion = contaminacion;
    }

    public int getNumerodepisos() {
        return numerodepisos;
    }

    public void setNumerodepisos(int numerodepisos) {
        this.numerodepisos = numerodepisos;
    }
        
}