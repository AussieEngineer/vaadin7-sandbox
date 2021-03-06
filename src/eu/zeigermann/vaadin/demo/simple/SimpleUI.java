package eu.zeigermann.vaadin.demo.simple;

import com.vaadin.annotations.PreserveOnRefresh;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@PreserveOnRefresh
public class SimpleUI extends UI {
	@Override
	public void init(VaadinRequest request) {
		VerticalLayout layout = new VerticalLayout();
		layout.setSpacing(true);
		setContent(layout);
		final Label label = new Label("Hello Vaadin user");
		layout.addComponent(label);
		Button button = new Button("Click Me");
		layout.addComponent(button);
		button.addClickListener(new ClickListener() {
			
			int cnt = 0;
			
			@Override
			public void buttonClick(ClickEvent event) {
				label.setValue("Clicked "+cnt++);
			}
		});
	}

}
