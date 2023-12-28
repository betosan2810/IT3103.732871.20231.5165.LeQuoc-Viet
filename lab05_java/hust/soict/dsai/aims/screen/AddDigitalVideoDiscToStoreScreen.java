package hust.soict.dsai.aims.screen;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import hust.soict.dsai.aims.Aims;
import hust.soict.dsai.aims.exception.DuplicatedItemException;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class AddDigitalVideoDiscToStoreScreen extends AddItemToStoreScreen {

	private JTextField tfTitle;
	private JTextField tfCategory;
	private JTextField tfDirector;
	private JTextField tfLength;
	private JTextField tfCost;

	public AddDigitalVideoDiscToStoreScreen() {
		super("DVD");

		JPanel center = createCenter();
		tfTitle = addInputField("Title: *", center);
		tfCategory = addInputField("Category:", center);
		tfDirector = addInputField("Director:", center);
		tfLength = addInputField("Length:", center);
		tfCost = addInputField("Cost: *", center);
		center.add(Box.createRigidArea(new Dimension(10, 40)));

		add(center, BorderLayout.CENTER);
		add(createSouth(new ButtonListener()), BorderLayout.SOUTH);

		setVisible(true);
	}

	private class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			switch (e.getActionCommand()) {
			case "OK": {
				if (tfTitle.getText().equals("") || tfCost.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Some required fields are empty!", "Error",
							JOptionPane.ERROR_MESSAGE);
					return;
				}

				try {
					DigitalVideoDisc dvd = new DigitalVideoDisc(
							tfTitle.getText(), 
							tfCategory.getText(),
							tfDirector.getText(), 
							tfLength.getText().equals("") ? 0 : Integer.parseInt(tfLength.getText()),
							Float.parseFloat(tfCost.getText()));

					Aims.getStore().addMedia(dvd);
					Aims.getStoreScreen().loadItemsToStore();

					setVisible(false);
					JOptionPane.showMessageDialog(null, "New DVD added to store!");
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Length and cost must be numeric!", "Error",
							JOptionPane.ERROR_MESSAGE);
				} catch (DuplicatedItemException e2) {
					JOptionPane.showMessageDialog(null, e2.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
				break;
			case "Cancel":
				setVisible(false);
				break;
			}
		}

	}
}
