package proyecto_junit;

public class SistemaLealtad {

    private boolean estatusTajeta;
    private int saldoPuntos;
    private boolean estatusCupon;
    private String productoExtra;


    public boolean getEstatusTarjeta() {
        return this.estatusTajeta;
    }

    public void setEstatusTarjeta(boolean estatusTarjeta) {
        this.estatusTajeta = estatusTarjeta;
    }

    public int getSaldoPuntos() {
        return saldoPuntos;
    }

    public void setSaldoPuntos(int saldoPuntos) {
        this.saldoPuntos = saldoPuntos;
    }

    public boolean getEstatusCupon() {
        return estatusCupon;
    }

    public void setEstatusCupon(boolean estatusCupon) {
        this.estatusCupon = estatusCupon;
    }    

    public String mostrarProductosExtras() {

        return productoExtra;
    }
    public void setProductosExtras(String prod) {
    	this.productoExtra=prod;
    }

    public void usarCupon(String respuesta) {

        if (respuesta.equals("Y")) {
        	this.estatusCupon=false;
        } else if (respuesta.equals("N")) {
        	this.estatusCupon=true;
        } else {

        }
    }

}