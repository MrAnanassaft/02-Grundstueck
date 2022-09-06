public class House {

    private int length;
    private int width;
    private int high;
    private String address;

    public House(int length, int width, int high, String address){
        this.length = length;
        this.width = width;
        this.high = high;
        this.address = address;
    }
    public double getVolume(){
        return length*width*high;
    }
    public String getAddress(){
        return this.address;
    }
}
