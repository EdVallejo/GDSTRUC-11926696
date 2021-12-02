package com.edvallejo;

public class Main {

    public static void main(String[] args) {
        Player asuna = new Player (1,"Asuna", 100);
        Player lethalBacon = new Player(2, "LethalBacon",200);
        Player hpDeskjet = new Player(3, "HPDeskjet", 34);

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        playerLinkedList.addToFront(asuna);
        playerLinkedList.addToFront(lethalBacon);
        playerLinkedList.addToFront(hpDeskjet);

        playerLinkedList.printList();

        playerLinkedList.removeFront();
        playerLinkedList.printList();

        playerLinkedList.contains(asuna);
        playerLinkedList.indexOf(2);
    }
}
