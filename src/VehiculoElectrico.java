public class VehiculoElectrico {

    private String modelo;
    private double capacidadBateria; // en kWh
    private double nivelActual;      // en kWh

    public VehiculoElectrico(String modelo, double capacidadBateria, double nivelInicial) {
        this.modelo = modelo;
        this.capacidadBateria = capacidadBateria;
        this.nivelActual = nivelInicial;
    }

    public String getModelo() {
        return modelo;
    }

    public double getCapacidadBateria() {
        return capacidadBateria;
    }

    public double getNivelActual() {
        return nivelActual;
    }

    public double getPorcentajeCarga() {
        return (nivelActual / capacidadBateria) * 100;
    }

    public boolean estaCargaCompleta() {
        return nivelActual >= capacidadBateria;
    }

    public void recibirCarga(double kw) {

        if (kw <= 0) {
            System.out.println(modelo + ": carga inválida.");
            return;
        }

        nivelActual = nivelActual + kw;

        // La batería no puede superar su capacidad
        if (nivelActual > capacidadBateria) {
            nivelActual = capacidadBateria;
        }
    }
}