package kz.bekmuratov.patters.creational.abstractFactory.factories;

import kz.bekmuratov.patters.creational.abstractFactory.buttons.Button;
import kz.bekmuratov.patters.creational.abstractFactory.checkboxes.Checkbox;

/**
 * Абстрактная фабрика знает обо всех (абстрактных) типах продуктов.
 */
public interface GUIFactory {
    public abstract Button createButton();
    public abstract Checkbox createCheckbox();
}
