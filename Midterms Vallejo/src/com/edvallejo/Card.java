package com.edvallejo;

import java.util.Objects;

public class Card {
    private int number;
    private String house;
    @Override
    public String toString() {
        return "Card{" +
                "number=" + number +
                ", house='" + house + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return number == card.number && Objects.equals(house, card.house);
    }
    @Override
    public int hashCode() {
        return Objects.hash(number, house);
    }
    public Card (int number, String house) {
        this.number = number;
        this.house = house;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getHouse() {
        return house;
    }
    public void setHouse(String house) {
        this.house = house;
    }
}
