/*
 * Use dynamic binding to calculate fares for different modes of transport (Bus, Train, Flight).
 */
abstract class Transport {
    abstract void calculateFare();
}

class Bus extends Transport {
    @Override
    void calculateFare() {
        System.out.println("Bus fare: $10");
    }
}

class Train extends Transport {
    @Override
    void calculateFare() {
        System.out.println("Train fare: $20");
    }
}

class Flight extends Transport {
    @Override
    void calculateFare() {
        System.out.println("Flight fare: $50");
    }
}

public class twentynine {
    public static void main(String[] args) {
        Transport[] transports = new Transport[3];
        transports[0] = new Bus();
        transports[1] = new Train();
        transports[2] = new Flight();
        for (Transport t : transports) {
            t.calculateFare();
        }
    }
}
