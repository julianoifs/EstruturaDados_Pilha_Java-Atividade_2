package com.dominio;

public class Pilha<T> {

    private Celula<T> inicio;
    private Celula<T> ultimo;
    private int tamanho;

    public Pilha() {
        this.inicio = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    // Adiciona um elemento na pilha
    public void adicionarPilha(T elemento) {
        Celula<T> celula = new Celula<T>(elemento);

        if (this.tamanho == 0) {
            this.ultimo = celula;
        } else {
            celula.setProximo(this.inicio);
        }
        this.inicio = celula;
        this.tamanho++;
    }

    // Remove o elemento do topo da pilha
    public void removerPilha() {
        Celula<T> atual = this.inicio;

        if (this.tamanho == 1) {
            this.inicio = null;
            this.ultimo = null;
        } else {
            this.inicio = this.inicio.getProximo();
            atual.setProximo(null);
        }
        this.tamanho--;
    }

    // Retorna o elemento que está no topo da pilha
    public T getTopo() {
        if (this.tamanho == 0) {
            return (T) null;
        }
        return this.inicio.getValor();
    }

    // Se a pilha estiver fazia retorna false, se não retorna verdadeiro
    public boolean contem() {
        if (this.tamanho == 0) {
            return false;
        }
        return true;
    }

    // Retorna a quantidade de elementos da pilha
    public int getTamanho() {
        return this.tamanho;
    }

    // Retorna um elemento de uma determinada posição
    public T mostraElemento(int posicao) throws Exception {
        Celula<T> atual = this.inicio;

        if (this.tamanho == 0 || posicao > this.tamanho) {
            throw new Exception("Posição Inválida!!");
        }

        for (int i = 0; i < posicao; i++) {
            if (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
        }
        return atual.getValor();
    }

    // Limpar toda a pilha
    public void limparPilha() {
        for (Celula<T> atual = this.inicio; atual != null;) {
            Celula<T> novoProximo = this.inicio.getProximo();
            atual.setValor(null);
            atual.setProximo(null);
            atual = novoProximo;
        }
        this.inicio = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    // Retorna todos os elementos contidos na pilha
    public T mostrarPilha() {
        if (this.tamanho == 0) {
            return (T) ("[]");
        }
        StringBuilder sb = new StringBuilder();
        Celula<T> atual = this.inicio;

        for (int i = 0; i < this.tamanho - 1; i++) {
            sb.append("|").append(atual.getValor()).append("|\n");
            atual = atual.getProximo();
        }
        sb.append("|").append(atual.getValor()).append("|");
        return (T) sb.toString();
    }

}
