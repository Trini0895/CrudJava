/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelo.dao;

import java.util.List;

/**
 *
 * @author Trini
 */
public interface Crud<T> {
    void crear (T t);
    List<T> listar();
    void borrar(int id);
}
