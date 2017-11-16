package kz.bekmuratov.patters.creational.abstractFactory.factories;

import kz.bekmuratov.patters.creational.abstractFactory.buttons.Button;
import kz.bekmuratov.patters.creational.abstractFactory.buttons.MacOSButton;
import kz.bekmuratov.patters.creational.abstractFactory.checkboxes.Checkbox;
import kz.bekmuratov.patters.creational.abstractFactory.checkboxes.MacOSCheckbox;

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
