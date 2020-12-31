package design_patterns.factory_method;

public class DemoFactory {

    private static Dialog dialog;

    public static void main(String[] args){
        dialog = new WindowsDialog();
        runBusinessLogin();
    }

    static void runBusinessLogin(){
        dialog.renderWindow();
    }
}
