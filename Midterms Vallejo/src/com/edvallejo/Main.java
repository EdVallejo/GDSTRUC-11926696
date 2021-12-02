package com.edvallejo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int rounds = 1;
        int action;
        int cardPick;

        CardStack playerDeck = new CardStack();
        for (int i = 1; i <= 30; i++){
            String house = null;
            int number = 1 + (int)(Math.random() * ((5 - 1) + 1));
            pickHouse(number, house);
            playerDeck.push(new Card(1 + (int)(Math.random() * ((10 - 1) + 1)), house));
        }

        CardStack playerHand = new CardStack();
        CardStack discardPile = new CardStack();

        while (playerDeck.getSize() != 0){
            commandOptions(rounds);

            //Command Chosen
            action = 1 + (int)(Math.random() * ((3 - 1) + 1));
            cardPick = 1 + (int)(Math.random() * ((5 - 1) + 1));
            random(action, cardPick);

            if (action == 1){
                drawFunction(cardPick, playerDeck, playerHand);
            }
            if (action == 2){
                discardFunction(cardPick, discardPile, playerHand);
            }
            if (action == 3){
                grabFromDiscard(cardPick, discardPile, playerHand);
            }

            endPhase(playerDeck.getSize(), playerHand.getSize(), discardPile.getSize(), rounds);
            rounds++;
            new Scanner(System.in).nextLine();
        }
    }

    public static void pickHouse(int number, String house){
        if(number == 1){
            house = "Diamond";
        }
        if(number == 2){
            house = "Spade";
        }
        if(number == 3){
            house = "Hearts";
        }
        if(number == 4){
            house = "Clovers";
        }
        if(number == 5){
            house = "Emeralds";
        }
    }
    public static void random(int action, int cardPick){
        System.out.println("Action picked: [" + action + "]");
        System.out.println("Cards to be added: [" + cardPick + "]");
        System.out.println();
    }
    public static void commandOptions(int number){
        System.out.println("Round [" + number + "] =============================");
        System.out.println("Possible Actions available");
        System.out.println("[1] - Draw Cards");
        System.out.println("[2] - Discard Cards");
        System.out.println("[3] - Get cards from the discard pile.");
    }
    public static void endPhase(int playerDeck, int playerHand, int discardPile, int number){
        System.out.println("Round [" + number + "] Complete! ===================");
        System.out.println("Card Deck: " + playerDeck);
        System.out.println("Player Hand: " + playerHand);
        System.out.println("Discard Pile: " + discardPile);
    }
    // Draw function
    public static void drawFunction(int cardPick, CardStack playerDeck, CardStack playerHand){
        System.out.println("Player drawing from card deck.");
        for (int i = 1; i <= cardPick; i++){
            if (playerDeck.getSize() == 0){
                System.out.println("There is no card available");
                break;
            }
            else {
                playerHand.push(playerDeck.pop());
            }
        }
    }
    public static void discardFunction(int cardPick, CardStack discardPile, CardStack playerHand){
        System.out.println("Player decides to discard.");
        for (int i = 1; i <= cardPick; i++){
            if (discardPile.getSize() == 0){
                System.out.println("There is no card to discard.");
                break;
            }
            else {
                discardPile.push(playerHand.pop());;
            }
        }
    }
    public static void grabFromDiscard(int cardPick, CardStack discardPile, CardStack playerHand){
        System.out.println("Player gets from the discard pile.");
        for (int i = 1; i <= cardPick; i++){
            if (discardPile.getSize() == 0){
                System.out.println("There is no card in the discard pile.");
                break;
            }
            else {
                playerHand.push(discardPile.pop());
            }
        }
    }

}