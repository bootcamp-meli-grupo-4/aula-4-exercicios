package exercicio04;

import javax.xml.stream.FactoryConfigurationError;

public class Book {
    private String titulo;
    private String autor;
    private Integer isbn;
    private boolean disponivel = true;


    public Book(){

    }

    public Book(String titulo, String autor, Integer isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    public boolean emprestimo(){
        if (disponivel){
            this.disponivel = false;
            return true;
        }
        return false;
    }

    public void devolver(){
        this.disponivel = true;
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

    public Integer getIsbn() {
        return isbn;
    }

    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "Book{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", isbn=" + isbn +
                '}';
    }
}
