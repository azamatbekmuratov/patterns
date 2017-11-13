package kz.bekmuratov.patters.patters.creational.factory;

/**
 * Диалог на элементах операционной системы.
 */
public class WindowsDialog extends DialogFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
