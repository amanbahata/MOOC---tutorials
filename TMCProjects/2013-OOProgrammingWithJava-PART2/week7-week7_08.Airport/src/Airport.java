import java.util.ArrayList;
import java.util.HashMap;

public class Airport {
    private HashMap<Airplane, ArrayList<Flight>> flightList;

    public Airport(){
        this.flightList = new HashMap<Airplane, ArrayList<Flight>>();
    }

    public void addPlane(Airplane airplane){
        this.flightList.put(airplane, new ArrayList<Flight>());
    }

    public void addFlight(String airplaneCode, Flight flight){
        for (Airplane airplane : this.flightList.keySet()) {
            if (airplane.getId().equals(airplaneCode)){
                this.flightList.get(airplane).add(flight);
            }
        }
    }

    public void printPlanes(){
        for (Airplane airplane : this.flightList.keySet()) {
            System.out.println(airplane);
        }
    }

    public void printFlights(){
        ArrayList<Flight> flights = new ArrayList<Flight>();
        for (Airplane airplane : this.flightList.keySet()) {
            flights = this.flightList.get(airplane);
            for (Flight flight : flights) {
                System.out.println(airplane + " " + flight);
            }
        }
    }

    public void printPlaneInfo(String planeCode){
        for (Airplane airplane : this.flightList.keySet()) {
            if (airplane.getId().equals(planeCode)){
                System.out.println(airplane);
            }
        }
    }





}
