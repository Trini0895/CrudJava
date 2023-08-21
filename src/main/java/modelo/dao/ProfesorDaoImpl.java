/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;

import java.util.List;
import modelo.Profesor;
import modelo.persistencia.ControladoraPersistencia;

/**
 *
 * @author Trini
 */
public class ProfesorDaoImpl {
    ControladoraPersistencia controladoraPersistencia = new ControladoraPersistencia();

    public void crear(Profesor p) {
      controladoraPersistencia.crear(p);
    }

    public List<Profesor> listar() {
        return controladoraPersistencia.listar();
    }

    public void borrar(int id) {
        controladoraPersistencia.borrar(id);
    }
}
