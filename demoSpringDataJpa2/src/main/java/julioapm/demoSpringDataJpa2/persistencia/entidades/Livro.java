package julioapm.demoSpringDataJpa2.persistencia.entidades;

import java.util.Collection;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column(nullable = false)
    private String titulo;
    @Column(nullable = false)
    private int ano;
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "codEditora", nullable = false)
    private Editora editora;
    @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private Collection<Autor> autores;

    public Livro() {
    }

    public Livro(String titulo, int ano, Editora editora, Collection<Autor> autores) {
        this.titulo = titulo;
        this.ano = ano;
        this.editora = editora;
        this.autores = autores;
    }

    public Long getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public Collection<Autor> getAutores() {
        return autores;
    }

    public void setAutores(Collection<Autor> autores) {
        this.autores = autores;
    }

    @Override
    public String toString() {
        return "Livro [getCodigo()=" + getCodigo() + ", getTitulo()=" + getTitulo() + ", getAno()=" + getAno()
                + ", getEditora()=" + getEditora() + "]";
    }

}
