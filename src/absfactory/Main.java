package absfactory;

import absfactory.app.ApplicationRender;
import absfactory.factory.HtmlUIComponentsFactory;
import absfactory.factory.JavaUIComponentsFactory;

public class Main {
    public static void main(String[] args) throws Exception {
        ApplicationRender webRender = new ApplicationRender(new HtmlUIComponentsFactory());
        ApplicationRender javaRender = new ApplicationRender(new JavaUIComponentsFactory());
        webRender.renderUI();
        javaRender.renderUI();
    }
}
