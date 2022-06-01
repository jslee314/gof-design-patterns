package factory;

import buttons.Button2;
import buttons.HtmlButton;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button2 createButton() {
        return new HtmlButton();
    }
}
