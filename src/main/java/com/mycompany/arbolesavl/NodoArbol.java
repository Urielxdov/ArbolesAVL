/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbolesavl;

/**
 *
 * @author Zomber
 */
public class NodoArbol <T extends Integer> {
    public T dato;
    public NodoArbol<T> izq;
    public NodoArbol<T> der;
    public NodoArbol<T> padre;        

    public NodoArbol(T dato) {
        this.dato = dato;
    }               

    @Override
    public String toString() {
        return " " + dato + " ";
    }
}
