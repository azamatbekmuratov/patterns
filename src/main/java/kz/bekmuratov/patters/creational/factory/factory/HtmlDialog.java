package kz.bekmuratov.patters.creational.factory.factory;

import kz.bekmuratov.patters.creational.factory.buttons.Button;
import kz.bekmuratov.patters.creational.factory.buttons.HtmlButton;

/**
 * HTML-dialog.
 */
public class HtmlDialog extends DialogFactory {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
