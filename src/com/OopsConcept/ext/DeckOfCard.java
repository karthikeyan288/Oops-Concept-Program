package com.OopsConcept.ext;

import java.util.*;

public class DeckOfCard {

	public static void main(String args[]) {
		String[] deckOfCard = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] cardRank = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		String[] cardsArray = new String[52];

		int start = 0;
		int end = 12;
		int stop = 0;
		
		for (int i = 0; i < 4; i++) {
			for (int j = start; j <= end; j++) {

				cardsArray[j] = " " +deckOfCard[i]  + cardRank[stop]+" ";
				stop++;
			}
			stop = 0;
			start = end + 1;
			end += 13;
		}

		// shuffling cards

		Random random = new Random();
		int f1, f2;
		String temp;
		for (int i = 0; i < 52; i++) {
			f1 = random.nextInt(51);
			f2 = random.nextInt(51);
			if (f1 != f2) {
				temp = cardsArray[f1];
				cardsArray[f1] = cardsArray[f2];
				cardsArray[f2] = temp;
			}
		}
		// printing the shuffled cards
		int collect = 0;
		for (int i = 0; i <= 4; i++) {
			System.out.println("The player "+ i+ " cards are : " );
			for (int j = 0; j < 9;j++) {
				System.out.print(cardsArray[collect]);
				collect++;
			}
			System.out.println("\t");
		}
	}

}