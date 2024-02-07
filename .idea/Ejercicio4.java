
//Algoritmo para calcular la velocidad media en un sistema de IA para el análisis de datos de transporte
def velocidad_media(espacio, tiempo):
velocidad = espacio / tiempo;
    return velocidad;

//Ejemplo de ejecución en un contexto de IA
espacio = float(input("Introduzca el espacio recorrido (km): "));
tiempo = float(input("Introduzca el tiempo empleado (horas): "));
velocidad = velocidad_media(distancia, tiempo);
print("La velocidad media es:", velocidad, "km/h");
