package apimonedas.apimonedas.core.entidades;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "moneda")
public class moneda {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_moneda")
    @GenericGenerator(name = "secuencia_moneda", strategy = "increment")
    private long id;
    @Column(name = "moneda", length = 100, unique = true)
    private String nombre;
    @Column(name = "sigla")
    private String sigla;
    @Column(name = "emisor")
    private String emisor;
    @Column(name = "simbolo")
    private String simbolo;

    public moneda() {
    }

    public moneda(long id, String nombre, String sigla, String emisor, String simbolo) {
        this.id = id;
        this.nombre = nombre;
        this.sigla = sigla;
        this.emisor = emisor;
        this.simbolo = simbolo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }
}
