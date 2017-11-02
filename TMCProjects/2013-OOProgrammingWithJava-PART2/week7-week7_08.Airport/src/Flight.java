public class Flight {

    private Airplane airplane;
    private Airport departureAirport;
    private Airport destinationAirport;

    public Flight(Airplane airplane, Airport departureAirport, Airport destinationAirport){
        this.airplane = airplane;
        this.departureAirport = departureAirport;
        this.destinationAirport = destinationAirport;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public Airport getDestinationAirport() {
        return destinationAirport;
    }

    public String toString(){
        return airplane.toString() + " (" + departureAirport + "-" + destinationAirport + ")";
    }
}
