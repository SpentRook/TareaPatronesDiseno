package absfactory.component.button;

public class HtmlButton implements Button {
    @Override
    public void onClick() {
        // codigo para el evento onClick...
        System.out.println("Se ha clickeado el boton html");
    }

    @Override
    public void render() {
        // logica para renderizar el boton
        System.out.println("Se ha renderizado el boton html");
    }
}
