public class House {

    private int length;
    private int width;
    private int high;

    public House(int length, int width, int high){
        this.length = length;
        this.width = width;
        this.high = high;
    }
    public double getVolume(){
        return length*width*high;
    }
}
