/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arbolesavl;

/**
 *
 * @author Zomber
 */
public class ArbolesAVL {

    public static void main(String[] args) {
        ArbolAVL<Integer> arbol = new ArbolAVL<>();
        
        // arbol.add(40);
        // arbol.add(30);
        // arbol.add(50);
        // arbol.add(20);
        // arbol.add(35);
        // arbol.add(45);
        // arbol.add(55);
        // arbol.add(10);
        // arbol.add(25);
        // arbol.add(32);
        // arbol.add(42);
        // arbol.add(5);
        // arbol.eleminarNodo(55);
        // arbol.eleminarNodo(32);
        // arbol.eleminarNodo(40);
        // arbol.eleminarNodo(30);

        arbol.add(10);
        arbol.add(5);
        arbol.add(15);
        arbol.add(7);
        arbol.add(12);
        arbol.eleminarNodo(10);

        System.out.println(arbol);
    }

}
