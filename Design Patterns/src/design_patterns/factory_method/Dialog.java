package design_patterns.factory_method;

public abstract class Dialog {

    public void renderWindow(){
        //other code
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
