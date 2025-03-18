public class Libro {
    private String titulo;
    private String autor;
    private int ano;
    private short numPaginas;
    private float valoracion;

    public Libro() {
        this.titulo = "Descoñecido";
        this.autor = "Descoñecido";
        this.ano = 0;
        this.numPaginas = 0;
        this.valoracion = 0.0f;
    }

    public Libro(String titulo, String autor, int ano, short numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.numPaginas = numPaginas;
        this.valoracion = 0.0f;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public short getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(short numPaginas) {
        this.numPaginas = numPaginas;
    }

    public float getValoracion() {
        return valoracion;
    }

    public void setValoracion(float valoracion) {
        this.valoracion = valoracion;
    }

    // Método amosar
    public void amosar() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + ano);
        System.out.println("Número de páxinas: " + numPaginas);
        System.out.println("Valoración: " + valoracion);
    }
}

