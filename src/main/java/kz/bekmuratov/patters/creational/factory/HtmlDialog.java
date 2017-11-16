package kz.bekmuratov.patters.creational.factory;

/**
 * HTML-dialog.
 */
public class HtmlDialog extends DialogFactory {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
