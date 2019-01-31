/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package card;

/**
 *A class to create Card
 * Each Card has suit and value
 * @author mehta - 31ST JAN,2019 
 */
public class Card {

    private String suit;
    //Hearts,Spades,Diamonds,Clubs

        private int value;
        
        public Card(String givenSuit,int givenValue)
        {
            suit=givenSuit;
            value=givenValue;
        }
    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        if(suit.equals("Hearts")||suit.equals("Spades")||suit.equals("Diamonds")||suit.equals("Clubs"))
        {
        this.suit = suit;
        }
        else
        {
            System.out.println("Hello..Not valid Suit. Please check");
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if(value<1 || value>13)
        {
            System.out.println("Not in range 1-13");
        }
        else
        {
            this.value = value;
        }
    }
    

    
}
