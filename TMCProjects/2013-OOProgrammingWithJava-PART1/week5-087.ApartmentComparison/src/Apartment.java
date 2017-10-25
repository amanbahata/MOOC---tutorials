
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean larger(Apartment otherApartment){
        return this.squareMeters > otherApartment.squareMeters;
    }

    public int priceDifference(Apartment otherApartment){
        return  Math.abs(this.calculatePrice() - otherApartment.calculatePrice());
    }

    public boolean moreExpensiveThan(Apartment otherApartment){
       return this.calculatePrice() > otherApartment.calculatePrice();
    }

    private int calculatePrice(){
        return this.squareMeters * this.pricePerSquareMeter;
    }
}
