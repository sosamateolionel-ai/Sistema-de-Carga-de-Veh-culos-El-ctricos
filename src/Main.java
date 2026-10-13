//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    VehiculoElectrico auto = new VehiculoElectrico("Auto Eléctrico", 60.0, 12.0); // 20% de carga
    SurtidorElectrico surtidor = new SurtidorElectrico("Surtidor 1", 7.0);

    // Caso 1: tiempo insuficiente, la carga termina parcial
    surtidor.iniciarCarga(auto, 3);

    // Caso 2: tiempo de sobra, se detiene sola al llegar al 100%
    surtidor.iniciarCarga(auto, 30);

    // Caso 3: intento de cargar una batería ya llena
    surtidor.iniciarCarga(auto, 5);

}
