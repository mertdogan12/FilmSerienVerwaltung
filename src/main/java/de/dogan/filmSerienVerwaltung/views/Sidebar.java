package de.dogan.filmSerienVerwaltung.views;

import javax.swing.*;
import java.awt.*;

public class Sidebar extends JPanel {

    public Sidebar() {
        super.setLayout(new BorderLayout());
        super.add(new AddButton(), BorderLayout.PAGE_END);
        super.setPreferredSize(new Dimension((int) (MainFrame.WIDTH * 0.3), 0));
    }
}
