package org.jis.plugins;

import org.kohsuke.MetaInfServices;
import javax.swing.JOptionPane;

/**
 * Created by Sebastian Schindler on 10.05.2014.
 *
 * Just a little Plugin to test if everything works
 */
@MetaInfServices
public class TestPlugin extends JmjrstPlugin {

    /**
     * Specifies if the plugin is configurable
     */
    private final boolean configurable = true;

    /**
     * Name of the plugin
     */
    private final String name = "Hallo-SWT1";

    /**
     * Text do display in the menu
     */
    private final String menuText = "Hallo SWT1-Fenster";

    /**
     * instance of the Main class form the parent software
     */
    private static org.jis.Main main;

    /**
     * Getter for the name
     * @return this.name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter for the menuText
     * @return this.menuText
     */
    public String getMenuText() {
        return this.menuText;
    }

    /**
     * Returns if this plugin is configurable
     * @return this.configurable
     */
    public boolean isConfigurable() {
        return this.configurable;
    }

    /**
     * Initializes the plugin, sets this.main
     * @param main Instance of the main class from parent project
     */
    public void init(org.jis.Main main) {
        this.main = main;
        System.out.println("Hallo SWT1-Konsole");
    }

    /**
     * Configures the Plugin
     */
    public void configure() {
        int i = main.menu.pluginConfigList.indexOf(this);
        JOptionPane.showMessageDialog(main.menu.buttonConfigList.get(i), this.getMenuText());
    }

    /**
     * Runs the Plugin
     */
    public void run() {
        System.err.print("Ich kann nur 'Hallo' sagen");
    }
}
