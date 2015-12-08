package com.manu.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class ManuOne extends Composite {

	// Widget composed from other widgets
	private VerticalPanel vPanel = new VerticalPanel();
	private Label question1;
	private Label question2;
	private Label question3;
	private Label question4;
	private Label question5;
	private Label question6;
	private Label question7;

	public ManuOne() {

		initWidget(this.vPanel);

		vPanel.setBorderWidth(1);

		this.question1 = new Label(" Kui palju aega kulub tööoperatsiooni läbi viimiseks?");
		vPanel.add(this.question1);
		this.question2 = new Label(" Kui palju aega kulub materjali ja töövahendite leidmiseks?");
		vPanel.add(this.question2);
		this.question3 = new Label(" Kui palju aega kulub tööriistade eelseadistuseks?");
		vPanel.add(this.question3);
		this.question4 = new Label(" Kui palju aega on seotud vahetult töötlemisega?");
		vPanel.add(this.question4);
		this.question5 = new Label(" Kui palju aega kulub tööde lõpetamiseks ja üleandmiseks?");
		vPanel.add(this.question5);
		this.question6 = new Label(" Kui palju aega kulub praagi avastamiseks ja eemaldamiseks?");
		vPanel.add(this.question6);
		this.question7 = new Label(" Kui palju aega kulub kvaliteedi tagamiseks?");
		vPanel.add(this.question7);
		vPanel.setSpacing(1);

		HorizontalPanel hPanel = new HorizontalPanel();
		hPanel.setBorderWidth(1);

		Button btn1 = new Button("Salvesta ja edasi!");
		btn1.addClickHandler(new ButtonClickHandler());
		hPanel.add(btn1);

		vPanel.add(hPanel);

	}

	public class ButtonClickHandler implements ClickHandler {

		@Override
		public void onClick(ClickEvent event) {
			// TODO Auto-generated method stub

		}

	}
}
