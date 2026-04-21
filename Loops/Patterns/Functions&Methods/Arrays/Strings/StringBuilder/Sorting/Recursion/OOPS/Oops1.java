class Pen{
    String colour;
    String type;
    public void write(){
        System.out.println("Writing Something");
    }
}

public class Oops1 {
    public static void main(String[] args) {
        Pen pen1=new Pen();
        pen1.colour="blue";
        pen1.type="gel";
        pen1.write();
    }
}
