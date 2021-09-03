package com.adapter.client;

import com.adapter.BuggatiVeyron;
import com.adapter.Movable;
import com.adapter.MovableAdapter;
import com.adapter.MovableAdapterImpl;

public class Client {
	public static void main(String[] args) {
		Movable bugattiVeyron = new BuggatiVeyron();
		MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);

		//assertEquals(bugattiVeyronAdapter.getSpeed(), 431.30312, 0.00001);
	}
}