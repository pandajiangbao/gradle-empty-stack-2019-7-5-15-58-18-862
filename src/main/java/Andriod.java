public class Andriod extends Mobile {
    public Andriod() {
    }

    public Andriod(String name, String color, String brand) {
        super(name, color, brand);
    }

    @Override
    public void call(String message){
        if (message.length()>8) System.out.println("<"+this.getClass().getName()+"> Message cannot be sent");
        else System.out.println("<Andriod>Message : " + message);
    }
}
