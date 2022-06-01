package factory;


import buttons.Button2;
import buttons.WindowsButton2;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button2 createButton() {
        return new WindowsButton2();
    }
}
