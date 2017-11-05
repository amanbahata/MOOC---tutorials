import java.util.Scanner;

public class UserInterface {

    Airport airport = new Airport();

    public void airportPanel(Scanner reader){

        String userSelection;

        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println();

        while (true) {

            System.out.println("Choose an operation:");
            System.out.print("" +
                    "[1] Add airplane\n" +
                    "[2] Add flight\n" +
                    "[x] Exit\n" +
                    "> ");

            userSelection = reader.nextLine().trim();

            if (userSelection.equals("1")) {

                System.out.print("Give plane ID: ");
                String planeId = reader.nextLine().trim();
                System.out.print("Give plane capacity: ");
                int capacity = Integer.parseInt(reader.nextLine().trim());

                Airplane airplane = new Airplane(planeId, capacity);
                this.airport.addPlane(airplane);


            } else if (userSelection.equals("2")) {

                System.out.print("Give plane ID: ");
                userSelection = reader.nextLine().trim();
                System.out.print("Give departure airport code: ");
                String departureAirport = reader.nextLine().trim();
                System.out.print("Give destination airport code: ");
                String destinationAirport = reader.nextLine().trim();

                Flight flight = new Flight(departureAirport, destinationAirport);

                airport.addFlight(userSelection, flight);


            } else if (userSelection.equals("x")) {
                flightService(reader);
                break;
            }
        }

    }

    private void flightService(Scanner reader) {

        String userSelection;

        System.out.println("Flight service");
        System.out.println("--------------------");
        System.out.println();


        while (true) {

            System.out.println("Choose operation:");
            System.out.print("" +
                    "[1] Print planes\n" +
                    "[2] Print flights\n" +
                    "[3] Print plane info\n" +
                    "[x] Quit\n" +
                    "> ");

            userSelection = reader.nextLine().trim();

            if (userSelection.equals("1")) {

                this.airport.printPlanes();

            } else if (userSelection.equals("2")) {

                this.airport.printFlights();

            }else if (userSelection.equals("3")){
                System.out.print("Give plane ID: ");

                String planeId = reader.nextLine();
                this.airport.printPlaneInfo(planeId);

            } else if (userSelection.equals("x")) {
                break;
            }
        }



    }



}
