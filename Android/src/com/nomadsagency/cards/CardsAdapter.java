/**
 * 
 */
package com.nomadsagency.cards;

import java.util.List;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.RootContext;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * @author valentijn
 *
 */
@EBean
public class CardsAdapter extends BaseAdapter {
	
	List<Card> cards;
	
	@Bean(CardsLoaderImpl.class)
	CardsLoader loader;
	
	@RootContext
	Context context;
	
	@AfterInject
	void initAdapter() {
		cards = loader.getCards();
	}
	
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		CardItemView cardItemView;
		
		if(convertView == null) {
			cardItemView = CardItemView_.build(context);
		} else {
			cardItemView = (CardItemView)convertView;
		}
		
		cardItemView.bind(getItem(position));
		
		return cardItemView;
	}


	@Override
	public int getCount() {
		return cards.size();
	}


	@Override
	public Card getItem(int position) {
		return cards.get(position);
	}


	@Override
	public long getItemId(int position) {
		return position;
	}

}
