package kz.bekmuratov.patters.creational.factory;

/**
 * Диалог на элементах операционной системы.
 */
public class WindowsDialog extends DialogFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
