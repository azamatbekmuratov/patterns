package kz.bekmuratov.patters.patters.creational.factory;

/**
 * HTML-dialog.
 */
public class HtmlDialog extends DialogFactory {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
