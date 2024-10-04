public class Main {
    public static void main(String[] args) {
        Taxes TX = new Taxes();

        TX.setVehicleDetails("Estate", 4800000, 5, 2000, 70000, 4, true);
        TX.calculateEstateTaxes();


        TX.setVehicleDetails("SUV", 3900000, 9, 40000, 98800, 7, true);
        TX.calculateSuvTaxes();

        TX.setVehicleDetails("Ambulance", 45000000, 9, 11100, 8800, 10, false);
        TX.calculateAmbulanceTaxes();

        TX.setVehicleDetails("Sedan", 60098000, 11, 34500, 40, 8, false);
        TX.calculateSedanTaxes();

        TX.setVehicleDetails("Trailer", 10000000, 5, 34400, 200, 10, true);
        TX.calculateTrailerTaxes();

        TX.calculateStandardVehicleTaxes();

        TX.calculateTransportationAndBondFees(9);
    }
}