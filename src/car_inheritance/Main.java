package car_inheritance;

public class Main {
    public static void main(String[] args) {
        Coupe myCar = new Coupe();
        myCar.setColor("red");
        System.out.println(myCar.getColor() +"--"+ myCar.getDoors());
    }
}
