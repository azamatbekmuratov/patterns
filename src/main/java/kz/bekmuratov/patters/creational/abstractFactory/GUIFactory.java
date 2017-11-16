package kz.bekmuratov.patters.creational.abstractFactory;

/**
 * Абстрактная фабрика знает обо всех (абстрактных) типах продуктов.
 */
public interface GUIFactory {
    public abstract Button createButton();
    public abstract Checkbox createCheckbox();
}
