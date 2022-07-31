package absfactory.factory;

import absfactory.component.button.Button;
import absfactory.component.input.TextInput;

public interface UIComponentsAbstractFactory {
    Button createButton();

    TextInput createTextInput();
}
