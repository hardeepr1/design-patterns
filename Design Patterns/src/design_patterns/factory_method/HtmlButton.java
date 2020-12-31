package design_patterns.factory_method;

public class HtmlButton implements Button{

    public void render(){
        System.out.println("<button> Test Button</Test>");
        onClick();
    }

    public void onClick(){
        System.out.println("Click! button says- hello world");
    }

}
