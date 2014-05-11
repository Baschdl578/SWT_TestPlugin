package org.jis.plugins;

import org.kohsuke.MetaInfServices;
import javax.swing.*;

/**
 * Created by Sebastian Schindler on 10.05.2014.
 */
@MetaInfServices
public class TestPlugin extends JmjrstPlugin {

    private final boolean configurable = true;
    private final String name = "Hallo-SWT1";
    private final String menuText = "Hallo SWT1-Fenster";

    public String getName() {
        return this.name;
    }

    public String getMenuText() {
        return this.menuText;
    }

    public boolean isConfigurable() {
        return this.configurable;
    }

    public void init(org.jis.Main main) {
        System.out.println("Hallo SWT1-Konsole");
    }

    public void configure() {
        JOptionPane.showMessageDialog(null, this.getMenuText());
        System.exit(0);
    }

    public void run() {
        System.err.print("Ich kann nur 'Hallo' sagen");
    }
}
