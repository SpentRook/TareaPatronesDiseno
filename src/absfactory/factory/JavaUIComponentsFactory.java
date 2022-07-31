package absfactory.factory;

import absfactory.component.button.Button;
import absfactory.component.button.JavaButton;
import absfactory.component.input.JavaTextInput;
import absfactory.component.input.TextInput;

public class JavaUIComponentsFactory implements UIComponentsAbstractFactory {
    @Override
    public Button createButton() {
        return new JavaButton();
    }

    @Override
    public TextInput createTextInput() {
        return new JavaTextInput();
    }
}
