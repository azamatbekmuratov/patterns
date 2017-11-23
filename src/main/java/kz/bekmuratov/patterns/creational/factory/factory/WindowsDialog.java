package kz.bekmuratov.patterns.creational.factory.factory;

import kz.bekmuratov.patterns.creational.factory.buttons.Button;
import kz.bekmuratov.patterns.creational.factory.buttons.WindowsButton;

/**
 * Диалог на элементах операционной системы.
 */
public class WindowsDialog extends DialogFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
