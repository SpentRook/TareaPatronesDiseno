package absfactory.component.button;

public class JavaButton implements Button {
    @Override
    public void onClick() {
        // codigo para el evento onClick...
        System.out.println("Se ha clickeado el boton java");
    }

    @Override
    public void render() {
        // logica para renderizar el boton
        System.out.println("Se ha renderizado el boton java");
    }
}
