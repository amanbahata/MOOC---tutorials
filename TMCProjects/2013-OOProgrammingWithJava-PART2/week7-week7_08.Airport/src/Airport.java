import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Airport {

    private String airportCode;
    private HashMap<String, Flight> flightList;
    private HashMap<String, Airplane> airplaneList;


    public Airport(String airportCode){
        this.airportCode = airportCode.toUpperCase();
        this.flightList = new HashMap<String, Flight>();
        this.airplaneList = new HashMap<String, Airplane>();


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

            System.out.println("Choose an operation: ");
            System.out.println("[1] add airplane");
            System.out.println("[2] add flight");
            System.out.println("[x] Exit");
            System.out.print("> ");
            userInput = reader.nextLine();

            if (userInput.equals("1")){
                System.out.print("Give plane ID: ");
                planeId = reader.nextLine();
                System.out.print("Give plane capacity: ");
                int planeCapacity = Integer.parseInt(reader.nextLine());

                Airplane airplane = new Airplane(planeId, planeCapacity);
                airplaneList.put(airplane.getId(), airplane);


            }else if (userInput.equals("2")){
                System.out.print("Give plane ID: ");
                planeId = reader.nextLine();
                System.out.print("Give departure airport code: ");
                String departureAirportCode = reader.nextLine();
                System.out.print("Give destination airport code: ");
                String destinationAirportCode = reader.nextLine();

                if (this.airplaneList.containsKey(planeId)){
                    Flight flight = new Flight(airplaneList.get(planeId),
                            new Airport(departureAirportCode), new Airport(destinationAirportCode));
                    this.flightList.put(planeId, flight);
                }else{
                    System.out.println("Please add airplane first !");
                    System.out.println();
                }
            }else if(userInput.equals("x")){
                loopControl = false;
            }
        }
        System.out.println();
    }


    public void startFlightService(Scanner reader){
        boolean loopControl = true;
        String userInput;

        System.out.println("Flight service");
        System.out.println("--------------------");
        System.out.println();


        while (loopControl) {

            System.out.println("Choose an operation: ");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Exit");
            System.out.print("> ");
            userInput = reader.nextLine();
            System.out.println();

            if (userInput.equals("1")){
                for (Object value : airplaneList.values()) {
                    System.out.println(value);
                }
            }else if(userInput.equals("2")){
                for (Object value : airplaneList.values()) {
                    Airplane airplane = (Airplane) value;

                    System.out.print(airplane + " ");
                    System.out.println(flightList.get(airplane.getId()));
                    
                }
            }else if(userInput.equals("3")){

                System.out.println("Nothing happens" );

            }else if(userInput.equals("x")){
                loopControl = false;
            }
        }

    }
}
