/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudaras.formularioAras;

/**
 *
 * @author xl3_c
 */
public class lista {
     String producto;
    String tamaño;
     String presentacion;
     String precioUnitario;
     String cantidad;
     String total;

    public lista(String producto, String tamaño, String presentacion, String precioUnitario, String cantidad, String total) {
        this.producto = producto;
        this.tamaño = tamaño;
        this.presentacion = presentacion;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
        this.total = total;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public String getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(String precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
    
    
    
    
}
