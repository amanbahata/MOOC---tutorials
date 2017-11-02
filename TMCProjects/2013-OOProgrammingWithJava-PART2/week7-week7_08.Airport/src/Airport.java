import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Airport {

    private Scanner reader;
    private String airportCode;
    private HashMap<Flight, Airplane> list;
    private ArrayList<Airplane> airplanes;

    public Airport(String airportCode, Scanner reader){
        this.airportCode = airportCode.toUpperCase();
        this.reader = reader;
        this.list = new HashMap<Flight, Airplane>();
        this.airplanes = new ArrayList<Airplane>();
    }

    public String getAirportCode() {
        return airportCode;
    }


    public void airportPanelStart(Scanner reader){
        String userInput;
        boolean loopControl = true;
        String planeId;

        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println();


        while (loopControl) {

            System.out.print("Choose an operation: ");
            System.out.print("[1] add airplane");
            System.out.print("[2] add flight");
            System.out.print("[x] Exit");
            System.out.print("> ");
            userInput = reader.nextLine();

            if (userInput.equals("1")){
                System.out.print("Give plane ID: ");
                planeId = reader.nextLine();
                System.out.println("Give plane capacity");
                int planeCapacity = Integer.parseInt(reader.nextLine());

                Airplane airplane = new Airplane(planeId, planeCapacity);

                if (!(airplanes.contains(airplane))){
                    airplanes.add(airplane);
                }

            }else if (userInput.equals("2")){
                System.out.print("Give plane ID: ");
                planeId = reader.nextLine();
                System.out.println("Give departure airport code: ");
                String departureAirportCode = reader.nextLine();
                System.out.println("Give destination airport code: ");
                String destinationAirportCode = reader.nextLine();

                for (Airplane airplane : airplanes) {
                    if (airplane.getId().equals(planeId)){
                        Airport departureAirport = new Airport(departureAirportCode, reader);
                        Airport destinationAirport  = new Airport(destinationAirportCode, reader);
                        Flight flight = new Flight(airplane,departureAirport, destinationAirport);
                        addTolList(airplane, flight);
                    }
                }
            }else if(userInput.equals("x")){
                loopControl = false;
            }
        }
    }


    private void startFlightService(){
        boolean loopControl = true;
        String userInput;

        System.out.println("Flight service");
        System.out.println("--------------------");
        System.out.println();


        while (loopControl) {

            System.out.print("Choose an operation: ");
            System.out.print("[1] Print planes");
            System.out.print("[2] Print flights");
            System.out.print("[x] Exit");
            System.out.print("> ");
            userInput = reader.nextLine();

            if (userInput.equals("1")){
                for (Airplane airplane : airplanes) {
                    System.out.println(airplane);
                }
            }else if(userInput.equals("2")){
                for (Airplane airplane : airplanes) {
                    System.out.println(airplane, );
                }
            }
        }

    }

    private void addTolList(Airplane airplane, Flight flight){
        this.list.put(flight, airplane);
    }
}
