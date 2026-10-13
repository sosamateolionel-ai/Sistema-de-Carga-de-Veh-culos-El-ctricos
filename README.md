# Sistema de Carga de Vehículos Eléctricos

## Descripción

Este proyecto consiste en un sistema de simulación de carga de vehículos eléctricos. Permite representar la batería de un vehículo, controlar su nivel de energía y simular el funcionamiento de un surtidor eléctrico que suministra energía durante un tiempo determinado.

El sistema muestra el progreso de la carga minuto a minuto y detiene automáticamente el proceso cuando la batería alcanza el 100%.

## Funcionamiento

1. Se crea un vehículo eléctrico con una batería de 60 kWh y un nivel inicial de 12 kWh, equivalente al 20% de carga.
2. Se crea un surtidor eléctrico con una potencia de carga de 7 kWh por minuto simulado.
3. Se inicia una carga de 3 minutos, que finaliza con la batería parcialmente cargada.
4. Se inicia una segunda carga de 30 minutos. El surtidor continúa hasta que la batería alcanza su capacidad máxima y detiene automáticamente el proceso.
5. Se intenta iniciar una tercera carga con la batería completa, por lo que el surtidor informa que no es necesario cargarla.

## Clase `VehiculoElectrico`

Representa un vehículo eléctrico y administra el estado de su batería.

### Atributos

* `modelo`: nombre o modelo del vehículo.
* `capacidadBateria`: capacidad máxima de la batería, expresada en kWh.
* `nivelActual`: cantidad de energía almacenada actualmente, expresada en kWh.

### Métodos principales

* `getModelo()`: devuelve el modelo del vehículo.
* `getCapacidadBateria()`: devuelve la capacidad máxima de la batería.
* `getNivelActual()`: devuelve el nivel actual de energía.
* `getPorcentajeCarga()`: calcula el porcentaje de carga de la batería.
* `estaCargaCompleta()`: comprueba si la batería alcanzó su capacidad máxima.
* `recibirCarga(double kw)`: incrementa el nivel de energía y evita que supere la capacidad máxima. Si la cantidad recibida es menor o igual a cero, informa que la carga es inválida.

## Clase `SurtidorElectrico`

Representa un surtidor encargado de suministrar energía a un vehículo eléctrico.

### Atributos

* `identificador`: código que identifica al surtidor.
* `potenciaKw`: cantidad de energía que entrega por cada minuto simulado.

### Métodos principales

* `iniciarCarga(VehiculoElectrico vehiculo, int minutos)`: inicia y controla el proceso de carga durante el tiempo indicado.
* Muestra el porcentaje de batería al comenzar la carga.
* Utiliza un ciclo `for` para simular el paso de los minutos.
* Informa el nivel de energía y el porcentaje de carga después de cada minuto.
* Detiene automáticamente el proceso cuando la batería llega al 100%.
* Informa si el tiempo de carga finaliza antes de completar la batería.

## Ejemplo de funcionamiento

El programa utiliza un vehículo con una batería de 60 kWh, un nivel inicial de 12 kWh y un surtidor que entrega 7 kWh por minuto simulado.

**Caso 1: carga parcial**

* Carga inicial: 12 kWh (20%).
* Tiempo solicitado: 3 minutos.
* Energía agregada: 21 kWh.
* Nivel final: 33 kWh (55%).

**Caso 2: carga completa**

* La batería comienza con 33 kWh.
* Se solicitan 30 minutos de carga.
* El surtidor agrega energía minuto a minuto hasta alcanzar los 60 kWh.
* La carga se detiene automáticamente al llegar al 100%.

**Caso 3: batería completa**

* Se intenta cargar nuevamente el vehículo.
* El surtidor detecta que la batería está llena.
* El proceso no se inicia.

## Conceptos de programación utilizados

* **Programación orientada a objetos (POO):** utilización de clases y objetos para representar el vehículo y el surtidor.
* **Encapsulamiento:** atributos privados y métodos públicos para consultar y modificar el estado de la batería.
* **Asociación entre clases:** `SurtidorElectrico` recibe una referencia a un objeto `VehiculoElectrico`.
* **Métodos booleanos:** `estaCargaCompleta()` permite comprobar si la batería llegó a su capacidad máxima.
* **Ciclo `for`:** simula el avance del tiempo durante la carga.
* **Condicionales `if`:** validan la cantidad de energía y determinan cuándo detener el proceso.
* **Uso de `return`:** permite finalizar la carga cuando se alcanza el 100%.
* **Validación de límites:** impide que la batería supere su capacidad máxima.
* **Formato decimal:** `String.format("%.1f", ...)` muestra los valores con un decimal.

## Tecnologías utilizadas

* Lenguaje: Java.
* Entorno de desarrollo recomendado: IntelliJ IDEA.

## Ejecución

<img width="807" height="482" alt="image" src="https://github.com/user-attachments/assets/55102c4a-11f2-428c-9d64-077c19d45ea8" />
