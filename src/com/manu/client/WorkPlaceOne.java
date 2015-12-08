package com.manu.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class WorkPlaceOne extends Composite {

	private VerticalPanel vPanel = new VerticalPanel();

	public WorkPlaceOne() {

		initWidget(this.vPanel);

		vPanel.setBorderWidth(1);

		final String[] questions = { "Kui kaua võtab aega töö alustamine töökohal?",
				"Kui palju kulub aega seoses ebasobivate töövõtetega?",
				"Kui palju kulub aega seoses seadme tühi käiguga?",
				"Kui palju vähendab toote kvaliteedikontroll masinaaja osatähtust?",
				"Kui palju kulub aega praaktoote korrigeerimisele?",
				"Kui palju kulub aega seoses töökoha halva korrashoiuga?",
				"Kui palju kulub aega, muudele tööga mitteseotud tegevustele?" };

		{
			for (int i = 0; i < questions.length; i++) {

				final Label questions1 = new Label(questions[i]);
				vPanel.add(questions1);
				vPanel.setSpacing(3);

			}
		}

	}
}
