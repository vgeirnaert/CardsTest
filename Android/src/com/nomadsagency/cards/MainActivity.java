package com.nomadsagency.cards;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ItemClick;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.WindowFeature;

import android.app.Activity;
import android.view.Window;
import android.widget.ListView;
import android.widget.Toast;

@WindowFeature({ Window.FEATURE_NO_TITLE, Window.FEATURE_INDETERMINATE_PROGRESS })
@EActivity(R.layout.activity_main)
public class MainActivity extends Activity {
	
	@ViewById(R.id.cardslist)
	ListView cardsList;
	
	@Bean
	CardsAdapter adapter;
	
	@AfterViews
	void initCardsList() {
		cardsList.setAdapter(adapter);
	}
	
	@ItemClick(R.id.cardslist)
	public void cardListItemClicked(Card card) {
		Toast.makeText(this, card.title, Toast.LENGTH_SHORT).show();
	}

}
