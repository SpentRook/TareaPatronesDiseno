package absfactory.app;

import absfactory.component.button.Button;
import absfactory.component.input.TextInput;
import absfactory.factory.UIComponentsAbstractFactory;

public class ApplicationRender {
    private UIComponentsAbstractFactory factory;

    public ApplicationRender(UIComponentsAbstractFactory factory) {
        this.factory = factory;
    }

    public void renderUI() {
        Button button = this.factory.createButton();
        button.render();
        TextInput textInput = this.factory.createTextInput();
        textInput.render();
    }
}
