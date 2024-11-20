package hierarchial;

class VehicleMainClass {
    

    public static void main(String[] args) {
        Bike b = new Bike();
        Car c = new Car();
        System.out.println(c.brand);
        System.out.println(c.color);
        c.Drive();
        System.out.println("--------");
        System.out.println(b.brand);
        System.out.println(b.cost+" Lakhs");
        b.Ride();
        
    }
    
}