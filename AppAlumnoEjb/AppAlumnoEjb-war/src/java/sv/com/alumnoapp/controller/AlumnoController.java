/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.com.alumnoapp.controller;

import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import sv.com.alumnoapp.entities.Alumno;
import sv.com.alumnoapp.model.AlumnoFacade;

/**
 *
 * @author sgrsm
 */
@ManagedBean
@SessionScoped
public class AlumnoController implements Serializable {

    @EJB
    private AlumnoFacade alumnoFacade;
    
    private Alumno alumno = new Alumno();

    /**
     * Creates a new instance of AlumnoController
     */
    public AlumnoController() {
        this.alumno = new Alumno();
    }
    
    public List<Alumno> listaTodosAlumnos(){
        return alumnoFacade.findAll();
    }
    
    public Alumno getAlumno(){
        return this.alumno;
    }
    
    public void setAlumno(Alumno alumno){
        this.alumno = alumno;
    }
    
    public String addAlumno(){
        alumnoFacade.create(alumno);
        this.alumno = new Alumno();
        return "index";
    }
    
    public String prepareEditAlumno(Alumno a){
        this.alumno = a;
        return "edit";
    }
    
    public String editAlumno(){
        this.alumnoFacade.edit(this.alumno);
        this.alumno = new Alumno();
        return "index";
    }
    
    public void deleteAlumno(Alumno a){
        this.alumnoFacade.remove(a);
    }
}
