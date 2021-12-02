package com.edvallejo;

public class PlayerLinkedList {
    private PlayerNode head;
    public int size = 0;

    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public void addToFront(Player player) {
        size++;
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
    }
    public void removeFront() {
        size--;
        head = head.getNextPlayer();
    }
    public void printList() {
        PlayerNode current = head;
        System.out.print("HEAD:");
        System.out.println();
        while (current != null) {
            System.out.println(current.getPlayer());
            current = current.getNextPlayer();
        }
        System.out.println("\nThe size of the linked list is: " + size);
        System.out.println();
    }

    public boolean contains(Player player) {
        PlayerNode current = head;
        while (current != null) {
            if (current.getPlayer() == player) {
                return true;
            }
            current = current.getNextPlayer();
        }
        System.out.println("False");
        return false;
    }
    public void indexOf(int id)
    {
        int index = 0;
        PlayerNode current = head;
        while (current != null)
        {
            if (current.getPlayer().getId() == id)
            {
                System.out.println("The index of ID number " + id + " is: " + index);
                break;
            }
            current = current.getNextPlayer();
            index++;
        }
        if (current == null)
        {
            System.out.println("This ID cannot be found.");
        }
    }
}
