package com.manu.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class WorkPlaceOne extends Composite {

	private VerticalPanel vPanel = new VerticalPanel();

	public WorkPlaceOne() {

		initWidget(this.vPanel);

		vPanel.setBorderWidth(1);

		final String[] questions = { "Kui kaua v�tab aega t�� alustamine t��kohal?",
				"Kui palju kulub aega seoses ebasobivate t��v�tetega?",
				"Kui palju kulub aega seoses seadme t�hi k�iguga?",
				"Kui palju v�hendab toote kvaliteedikontroll masinaaja osat�htust?",
				"Kui palju kulub aega praaktoote korrigeerimisele?",
				"Kui palju kulub aega seoses t��koha halva korrashoiuga?",
				"Kui palju kulub aega, muudele t��ga mitteseotud tegevustele?" };

		{
			for (int i = 0; i < questions.length; i++) {

				final Label questions1 = new Label(questions[i]);
				vPanel.add(questions1);
				vPanel.setSpacing(3);

			}
		}

	}
}
