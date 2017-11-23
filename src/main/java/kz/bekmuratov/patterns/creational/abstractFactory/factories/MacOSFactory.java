package kz.bekmuratov.patterns.creational.abstractFactory.factories;

import kz.bekmuratov.patterns.creational.abstractFactory.buttons.Button;
import kz.bekmuratov.patterns.creational.abstractFactory.buttons.MacOSButton;
import kz.bekmuratov.patterns.creational.abstractFactory.checkboxes.Checkbox;
import kz.bekmuratov.patterns.creational.abstractFactory.checkboxes.MacOSCheckbox;

/**
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
