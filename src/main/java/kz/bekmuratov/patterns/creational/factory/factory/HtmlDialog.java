package kz.bekmuratov.patterns.creational.factory.factory;

import kz.bekmuratov.patterns.creational.factory.buttons.Button;
import kz.bekmuratov.patterns.creational.factory.buttons.HtmlButton;

/**
 * HTML-dialog.
 */
public class HtmlDialog extends DialogFactory {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
