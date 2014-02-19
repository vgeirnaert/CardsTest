package com.nomadsagency.cards;

import java.util.Arrays;
import java.util.List;

import org.androidannotations.annotations.EBean;

@EBean
public class CardsLoaderImpl implements CardsLoader {

	@Override
	public List<Card> getCards() {
		return Arrays.asList(new Card[]{new Card("Title 1", "Description 1"), new Card("Title 2", "Description 2"), new Card("Title 3", "Description 3"), new Card("Title 4", "Description 4"), new Card("Title 5", "Description 5")});
	}

}
