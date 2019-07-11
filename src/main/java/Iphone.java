public class Iphone extends Mobile {
    public Iphone() {
        super();
    }
    public Iphone(String name, String color, String brand) {
        super(name, color, brand);
    }
    @Override
    public void call(String message){
        if (message.length()>5) System.out.println("<"+this.getClass().getName()+"> Message cannot be sent");
        else System.out.println("<iPhone>Message : " + message);
    }
}
