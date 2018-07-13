package com.ust.calc.calculadora.clients.entity;

public class EmployeeDS {

	private String id;
    private String name;
    private String email;
    private String salary;
    private String dni;
    private String fecnac;
    private String direccion;
    private String ctacte;
    private String estadocivil;
    private String sexo;
    private String fecalta;
    private String categoria;
    private String tipocontrato;
    private String nsegsoc;
    private String numtel;
    private String fecbaja;
   
   
    public EmployeeDS(String id, String name, String email, String salary, String dni, String fecnac,
                    String direccion, String ctacte, String estadocivil, String sexo, String fecalta,
                    String categoria, String tipocontrato, String nsegsoc, String numtel, String fecbaja){
       
        this.id = id;
        this.name = name;
        this.email = email;
        this.salary = salary;
        this.dni = dni;
        this.fecnac = fecnac;
        this.direccion = direccion;
        this.ctacte = ctacte;
        this.estadocivil = estadocivil;
        this.sexo = sexo;
        this.fecalta = fecalta;
        this.categoria = categoria;
        this.tipocontrato = tipocontrato;
        this.nsegsoc = nsegsoc;
        this.numtel = numtel;
        this.fecbaja = fecbaja;
       
    }
   
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getSalary() {
        return salary;
    }
    public String getDni() {
        return dni;
    }
    public String getFecnac() {
        return fecnac;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getCtacte() {
        return ctacte;
    }
    public String getEstadocivil() {
        return estadocivil;
    }
    public String getSexo() {
        return sexo;
    }
    public String getFecalta() {
        return fecalta;
    }
    public String getCategoria() {
        return categoria;
    }
    public String getTipocontrato() {
        return tipocontrato;
    }
    public String getNsegsoc() {
        return nsegsoc;
    }
    public String getNumtel() {
        return numtel;
    }
    public String getFecbaja() {
        return fecbaja;
    }

}


