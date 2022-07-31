package absfactory.component.input;

public class JavaTextInput implements TextInput {

    private String text;
    private Boolean isBlocked = false;

    @Override
    public void setText(String text) {
        if (!isBlocked) {
            this.text = text;
        }

    }

    @Override
    public String getText() {
        return this.text;
    }

    @Override
    public void blockInput() {
        // logica para bloquear el input
        this.isBlocked = true;
        System.out.println("Se ha bloqueado el input text de java");
    }

    @Override
    public void render() {
        // logica para renderizar el boton
        System.out.println("Se ha renderizado el input text en java");
    }
}
