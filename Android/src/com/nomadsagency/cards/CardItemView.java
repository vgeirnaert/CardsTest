/**
 * 
 */
package com.nomadsagency.cards;

import org.androidannotations.annotations.EViewGroup;
import org.androidannotations.annotations.ViewById;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * @author valentijn
 *
 */
@EViewGroup(R.layout.card_item)
public class CardItemView extends LinearLayout {

	@ViewById(R.id.textView1)
	TextView title;
	
	@ViewById(R.id.textView2)
	TextView description;
	
	public CardItemView(Context context) {
		super(context);
	}
	
	public void bind(Card card) {
		title.setText(card.title);
		description.setText(card.description);
	}
}
