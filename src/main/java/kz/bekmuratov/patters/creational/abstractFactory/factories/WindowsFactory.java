package kz.bekmuratov.patters.creational.abstractFactory.factories;

import kz.bekmuratov.patters.creational.abstractFactory.buttons.Button;
import kz.bekmuratov.patters.creational.abstractFactory.buttons.WindowsButton;
import kz.bekmuratov.patters.creational.abstractFactory.checkboxes.Checkbox;
import kz.bekmuratov.patters.creational.abstractFactory.checkboxes.WindowsCheckbox;

/**
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
