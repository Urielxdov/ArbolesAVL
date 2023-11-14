package com.mycompany.arbolesavl;

public class ListaSimple<T> {
    private NodoDoble<T> inicio, fin;
    private int tamaño;

    public void add(T val) {
        if (inicio == null) { // la lista existe?
            inicio = fin = new NodoDoble<T>(val);
            tamaño++;
        } else { // ya existe la lista
            NodoDoble<T> n = new NodoDoble<T>(val);
            fin.der = n;
            n.izq = fin;
            fin = fin.der;
            tamaño++;
        }
    }

    public NodoDoble<T> remove() {
        NodoDoble<T> temp = null;
        if (tamaño == 0) {
            temp = inicio;
            inicio = inicio.der;
            temp.der = inicio.der = null;
            tamaño--;
        } else {
        }
        return null;
    }

    public void addFirst(T nombre) {
        if (inicio != null) {
            NodoDoble<T> nuevo = new NodoDoble<T>(nombre);
            // validar si la lista existe o no
            if (inicio == null) {
                inicio = fin = nuevo;
                // si la lista no existe la creamos
                tamaño++;
            } else { // conectar a la izq el nuevo nodo
                nuevo.der = inicio;
                inicio = nuevo;
                tamaño++;
            }
        }
    }

    public void addX(T valor, int pos) {
        if (pos >= 1 && pos <= tamaño + 1) {
            NodoDoble<T> nuevo = new NodoDoble<T>(valor);
            NodoDoble<T> cursor = inicio;
            if (pos == 1) {
                addFirst(nuevo);
            } else if (pos == tamaño + 1) {
                add(nuevo);
            } else {
                // ciclo para posicionar en cursor uno antes de la pos deseada
                for (int i = 1; i < pos - 1; i++) {
                    cursor = cursor.der;
                }
                nuevo.izq = cursor;
                nuevo.der = cursor.der;
                cursor.der.izq = nuevo;
                cursor.der = nuevo;
                tamaño++;
            }
        }
    }

    public void add(NodoDoble<T> nodo) {
        if (inicio == null) {
            inicio = fin = nodo;
            tamaño++;
        } else { // ya existe la lista
            NodoDoble<T> nuevo = nodo;
            fin.der = nuevo;
            nuevo.izq = fin;
            fin = fin.der;
            tamaño++;
        }
    }

    public void addFirst(NodoDoble<T> nodo) {
        if (inicio != null) {
            NodoDoble<T> nuevo = nodo;
            nuevo.der = inicio;
            inicio.izq = nuevo;
            inicio = inicio.izq;
            tamaño++;
        }
        add(nodo);
    }

    @Override
    public String toString() {
        String cadena = "Lista (" + tamaño + ") {";
        // colocar el cursor al inicio de la lista
        NodoDoble<T> cursor = inicio;
        // comprobar si cursor es diferente de null
        while (cursor != null) {
            cadena += cursor + " ";
            cursor = cursor.der;
        }
        return cadena + "}";
    }

    public class NodoDoble <T>{
        private T dato;
        private NodoDoble<T> der, izq;

        public NodoDoble(T dato) {
            this.dato = dato;
        }

        @Override
        public String toString() {
            return " " + dato + " ";
        }
    }

}
