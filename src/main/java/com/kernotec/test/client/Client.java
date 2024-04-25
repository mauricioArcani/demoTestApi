package com.kernotec.test.client;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;
    @Column(unique = true)
    private String nombre;
    private String paterno;
    private String materno;
    private String tipoDocumento;
    private String nroDocumento;
    private LocalDate fechaNacimiento;
    
    public Client(){
        
    }

    public Client(Long idCliente, String nombre, String paterno, String materno, String tipoDocumento,
             String nroDocumento, LocalDate fechaNacimiento) {
         this.idCliente = idCliente;
         this.nombre = nombre;
         this.paterno = paterno;
         this.materno = materno;
         this.tipoDocumento = tipoDocumento;
         this.nroDocumento = nroDocumento;
         this.fechaNacimiento = fechaNacimiento;
     }

     public Client(String nombre, String paterno, String materno, String tipoDocumento,
             String nroDocumento, LocalDate fechaNacimiento) {
         this.nombre = nombre;
         this.paterno = paterno;
         this.materno = materno;
         this.tipoDocumento = tipoDocumento;
         this.nroDocumento = nroDocumento;
         this.fechaNacimiento = fechaNacimiento;
     }




    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(String nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    

    
}
