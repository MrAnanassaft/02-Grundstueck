public class MainProgram {
    public static void main(String[] args) {
        Property p1 = new Property("erzbergerstraße 1", 10, 20 );
        System.out.println(p1.getAddress() + "-" + p1.getSize() + "m²");
        Property p2 = new Property("erzbergerstraße 2", 12, 20 );
        System.out.println(p2.getAddress() + "-" + p2.getSize() + "m²");
    }
}