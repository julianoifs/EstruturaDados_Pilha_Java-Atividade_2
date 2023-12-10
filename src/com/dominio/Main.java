package com.dominio;

public class Main {

    public static void main(String[] args) throws Exception {

        Pilha<Integer> pilha = new Pilha<>();

        // Testando métodos
        // Antes de adicionar elementos na pilha
        System.out.println("Tamanho: " + pilha.getTamanho());
        System.out.println("A pilha possui elementos? " + pilha.contem());
        System.out.println("Topo da pilha: " + pilha.getTopo());
        System.out.println("Pilha\n" + pilha.mostrarPilha());

        // Adicionando elementos na pilha
        pilha.adicionarPilha(1);
        pilha.adicionarPilha(2);
        pilha.adicionarPilha(3);
        pilha.adicionarPilha(4);
        pilha.adicionarPilha(5);
        pilha.adicionarPilha(6);
        System.out.println("\nApós adicionar elementos na pilha:\n");

        // Após adicionar elementos na pilha
        System.out.println("Tamanho: " + pilha.getTamanho());
        System.out.println("A pilha possui elementos? " + pilha.contem());
        System.out.println("Topo da pilha: " + pilha.getTopo());
        System.out.println("Pilha\n" + pilha.mostrarPilha());

        // Mostrando elemento de uma determinada posição
        System.out.println("\nMostrando um dado elemento pela sua posição");
        System.out.println("Pegando um elemento da posição 0 da pilha: " + pilha.mostraElemento(0));
        System.out.println("Pegando um elemento da posição 1 da pilha: " + pilha.mostraElemento(1));
        System.out.println("Pegando um elemento da posição 2 da pilha: " + pilha.mostraElemento(2));
        System.out.println("Pegando um elemento da posição 3 da pilha: " + pilha.mostraElemento(3));
        System.out.println("Pegando um elemento da posição 6 da pilha: " + pilha.mostraElemento(6));

        // apagando o elemento do topo da pilha
        System.out.println("\nRemovendo 2 elementos da pilha");
        pilha.removerPilha();
        pilha.removerPilha();

        System.out.println("\nApós remover elementos:\n");
        System.out.println("Tamanho: " + pilha.getTamanho());
        System.out.println("A pilha possui elementos? " + pilha.contem());
        System.out.println("Topo da pilha: " + pilha.getTopo());
        System.out.println("Pilha\n" + pilha.mostrarPilha());

        // Limpando toda a pilha
        System.out.println("\nLimpando toda pilha");
        pilha.limparPilha();

        System.out.println("\nApós limpar a pilha:\n");
        System.out.println("Tamanho: " + pilha.getTamanho());
        System.out.println("A pilha possui elementos? " + pilha.contem());
        System.out.println("Topo da pilha: " + pilha.getTopo());
        System.out.println("Pilha\n" + pilha.mostrarPilha());

    }
}
