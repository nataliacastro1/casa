package casas;

import java.util.Date;

public class urbana extends casa{
    
    private int zonas;
    private Date fechadeinicio;
    private String nombredelbarrio;

    public urbana(int zonas, Date fechadeinicio, String nombredelbarrio) {
        this.zonas = zonas;
        this.fechadeinicio = fechadeinicio;
        this.nombredelbarrio = nombredelbarrio;
    }

    public void renombrarzonas(String nuevopiso){
        this.nombredelbarrio = nombredelbarrio;
    }
    
    public void renombrarzonas(String nuevopiso, int categoria){
        this.nombredelbarrio = nuevopiso + " de " + categoria;
    }
    
    public int getZonas() {
        return zonas;
    }

    public void setZonas(int zonas) {
        this.zonas = zonas;
    }

    public Date getFechadeinicio() {
        return fechadeinicio;
    }

    public void setFechadeinicio(Date fechadeinicio) {
        this.fechadeinicio = fechadeinicio;
    }

    public String getNombredelbarrio() {
        return nombredelbarrio;
    }

    public void setNombredelbarrio(String nombredelbarrio) {
        this.nombredelbarrio = nombredelbarrio;
    }
    
}
