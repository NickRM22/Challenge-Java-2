package CO2;

public class CO2Emission {

    double carEmission = 192.0;
    double busEmission = 1050.0;

    public double calculateSavings(double distanceKm, int busPassengers) {

        if (busPassengers <= 0) {
            System.out.println("Quantidade de passageiros inválida.");
            return 0;
        }

        double busEmissionPerPerson = busEmission / busPassengers;

        double savingsPerKm = carEmission - busEmissionPerPerson;

        return savingsPerKm * distanceKm;
    }
}

