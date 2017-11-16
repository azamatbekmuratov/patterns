package kz.bekmuratov.patters.creational.factory.factory;

import kz.bekmuratov.patters.creational.factory.buttons.Button;
import kz.bekmuratov.patters.creational.factory.buttons.WindowsButton;

/**
 * Диалог на элементах операционной системы.
 */
public class WindowsDialog extends DialogFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
