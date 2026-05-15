package CO2;

public class CO2 {
    public class CO2Emission {

        double carEmission = 192.0;
        double busEmission = 1050.0;

        public double calculateSavings(double distanceKm, int busPassengers) {

            double busEmissionPerPerson = busEmission / busPassengers;

            double savingsPerKm = carEmission - busEmissionPerPerson;

            return savingsPerKm * distanceKm;
        }
    }
}
