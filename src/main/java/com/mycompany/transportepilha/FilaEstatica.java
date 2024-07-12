package com.mycompany.transportepilha;

public class FilaEstatica<T> {
    private int tamanhoMaximo = 10;
    private int inicio;
    private int fim;
    private int total;
    private T[] elementos;

    public FilaEstatica() {
        this.elementos = (T[]) new Object[tamanhoMaximo];
        this.inicio = 0;
        this.fim = -1;
        this.total = 0;
    }

    public boolean isFull() {
        return total == tamanhoMaximo;
    }

    public boolean isEmpty() {
        return total == 0;
    }

    public boolean enqueue(T elemento) {
        if (!isFull()) {
            if (fim == tamanhoMaximo - 1) {
                fim = -1;
            }
            elementos[++fim] = elemento;
            total++;
            return true;
        } else {
            return false;
        }
    }

    public T dequeue() {
        if (!isEmpty()) {
            T elemento = elementos[inicio++];
            if (inicio == tamanhoMaximo) {
                inicio = 0;
            }
            total--;
            return elemento;
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for (int i = 0; i < total; i++) {
            int index = (inicio + i) % tamanhoMaximo;
            sb.append(elementos[index]);
            if (i != total - 1) {
                sb.append(", ");
            }
        }
        sb.append(" ]");
        return sb.toString();
    }
}
