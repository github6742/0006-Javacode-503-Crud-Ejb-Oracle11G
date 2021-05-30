/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.com.alumnoapp.model;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sv.com.alumnoapp.entities.Alumno;

/**
 *
 * @author sgrsm
 */
@Stateless
public class AlumnoFacade extends AbstractFacade<Alumno> {

    @PersistenceContext(unitName = "AppAlumnoEjb-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AlumnoFacade() {
        super(Alumno.class);
    }
    
}
