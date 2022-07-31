package absfactory.component.input;

public interface TextInput {
    void setText(String text);

    String getText();

    void blockInput();

    void render();
}