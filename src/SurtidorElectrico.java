public class SurtidorElectrico {

    private String identificador;
    private double potenciaKw; // kW entregados por minuto simulado

    public SurtidorElectrico(String identificador, double potenciaKw) {
        this.identificador = identificador;
        this.potenciaKw = potenciaKw;
    }

    public void iniciarCarga(VehiculoElectrico vehiculo, int minutos) {

        System.out.println("\n[" + identificador + "] Iniciando carga de " + vehiculo.getModelo()
                + " (" + String.format("%.1f", vehiculo.getPorcentajeCarga()) + "%)");

        if (vehiculo.estaCargaCompleta()) {
            System.out.println("[" + identificador + "] La batería ya está completa, no se inicia la carga.");
            return;
        }

        for (int minuto = 1; minuto <= minutos; minuto++) {

            vehiculo.recibirCarga(potenciaKw);

            System.out.println("Minuto " + minuto + ": nivel "
                    + String.format("%.1f", vehiculo.getNivelActual()) + " kWh ("
                    + String.format("%.1f", vehiculo.getPorcentajeCarga()) + "%)");

            if (vehiculo.estaCargaCompleta()) {
                System.out.println("[" + identificador + "] Batería al 100%. Carga detenida automáticamente en el minuto " + minuto + ".");
                return;
            }
        }

        System.out.println("[" + identificador + "] Tiempo de carga finalizado.");
    }
}