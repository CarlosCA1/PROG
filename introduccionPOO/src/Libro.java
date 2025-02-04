/**
* Clase que representa a un libro.
**/
public class Libro {
    //Propiedades de la clase libro
    private String titulo;
    private String autor;
    private int numPaginas;
    private double precio;
    private int cantidad;

    public Libro(String tit, String aut, int pag, double prec, int cant) {
        titulo=tit;
        autor=aut;
        setNumPaginas(pag);
        setPrecio(prec);
        setCantidad(cant);
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public int getNumPaginas(){
        return numPaginas;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setTitulo(String nuevoTitulo) {
        titulo = nuevoTitulo;
    }

    public void setAutor (String nuevoAutor) {
        autor = nuevoAutor;
    }

    public void setNumPaginas(int nuevasPaginas) {
        if (nuevasPaginas>0) numPaginas = nuevasPaginas;
        else System.out.println("El número de páginas debe ser mayor que 0");
    }

    public void setPrecio(double nuevoPrecio) {
        if(nuevoPrecio>0) precio = nuevoPrecio;
        else System.out.println("El precio debe ser mayor que 0");
    }

    public void setCantidad(int nuevaCantidad) {
        if (nuevaCantidad>=0) cantidad = nuevaCantidad;
        else System.out.println("La cantidad no puede ser negativa");
    }

    public boolean venderLibro(int cantidadVenta) {
        if (cantidad>=cantidadVenta) {
            actualizarCantidad(-cantidadVenta);
            return true;
        }
        else return false;
    }
    public void registrarEntradaLibro(int cantidadEntrada){
        actualizarCantidad(cantidadEntrada);
    }
    private void actualizarCantidad (int cantidadActualizar){
        cantidad = cantidad + cantidadActualizar;
    }
}
