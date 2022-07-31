package absfactory.factory;

import absfactory.component.button.Button;
import absfactory.component.button.HtmlButton;
import absfactory.component.input.HtmlTextInput;
import absfactory.component.input.TextInput;

public class HtmlUIComponentsFactory implements UIComponentsAbstractFactory {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }

    @Override
    public TextInput createTextInput() {
        return new HtmlTextInput();
    }
}
