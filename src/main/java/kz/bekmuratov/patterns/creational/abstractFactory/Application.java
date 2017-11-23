package kz.bekmuratov.patterns.creational.abstractFactory;

import kz.bekmuratov.patterns.creational.abstractFactory.buttons.Button;
import kz.bekmuratov.patterns.creational.abstractFactory.checkboxes.Checkbox;
import kz.bekmuratov.patterns.creational.abstractFactory.factories.GUIFactory;

/**
 * Код, использующий фабрику, не волнует с какой конкретно фабрикой он работает.
 * Все получатели продуктов работают с продуктами через абстрактный интерфейс.
 */
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory){
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint(){
        button.paint();
        checkbox.paint();
    }
}
