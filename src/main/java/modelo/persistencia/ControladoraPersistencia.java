/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Profesor;
import modelo.persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author Trini
 */
public class ControladoraPersistencia {
     ProfesorJpaController profesorJpa = new ProfesorJpaController();

    public void crear(Profesor p) {
        profesorJpa.create(p);
    }

    public List<Profesor> listar() {
        return profesorJpa.findProfesorEntities();
    }

    public void borrar(int id) {
        try {
            profesorJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
