// TaskManager 4.1 es un sistema encargado de la organización de actividades para distintos 
// dominios. Existen distintos tipos de actividades: Tarea Simple posee una acción a realizar 
// (“cocinar”, levantar Paredes”, “Pintar Techo”....), un costo asociado y un tiempo estimado. 
// Las tareas por lo general se agrupan en tareas compuestas, las cuales pueden tener tanto 
// tareas simples como otras tareas compuestas. Tarea compuesta posee una especialidad 
// (“Cocina”, “Construcción”, …),  El costo de la misma se calcula como la suma de los costos 
// de los elementos contenidos. El tiempo estimado se calcula como la suma de los tiempos 
// estimados de los elementos contenidos más 10 minutos por cada tarea (simple) contenida. 
// Debe ser posible obtener un listado de las acciones a realizar, el cual consistirá en una lista de 
// todas las acciones de sus elementos, por ejemplo <”Elaborar masa”,”hornear”, “desmoldar”>.  
// Para agilizar el trabajo a realizar TaskManager 4.1 incorpora la novedad de dos nuevos tipos 
// de tareas compuestas: 
// Tarea Compuesta Repetitiva: la cual posee una lista de actividades de cualquier tipo, pero 
// tiene un indicador de las veces que se repiten. Por ejemplo, una tarea compuesta repetitiva 
// puede indicar que se realizan 3 veces las actividades en ella contenida. De esta forma el costo 
// se calcula como la suma de los costos por la cantidad de repeticiones, lo mismo para el 
// tiempo estimado y en el caso de la lista de acciones se repiten las acciones de las actividades 
// contenidas, las veces indicadas en la tarea repetitiva 

public class Main {
  public static void main(String[] args) {
    Simple ordenar = new Simple("Ordenar", 5, 10);
    Simple batir = new Simple("Batir", 5, 10);
    Simple dejar = new Simple("Dejar descansar", 5, 10);
    Simple hornear = new Simple("Hornear", 5, 10);
    Simple desmoldar = new Simple("Desmoldar", 5, 10);

    Compuesta cocinar = new Compuesta("Cocinar", 10);
    cocinar.addTarea(batir);
    cocinar.addTarea(dejar);

    Compuesta hacerReceta = new Compuesta("Hacer receta", 10);

    Repetitiva repetir = new Repetitiva(3);
    repetir.addTarea(ordenar);
    repetir.addTarea(cocinar);
    repetir.addTarea(hornear);

    
    hacerReceta.addTarea(repetir);
    hacerReceta.addTarea(desmoldar);
    
    // TIEMPO:
    // cocinar -> batir (10) + dejar (10) + 10 * 2 = 40
    // repetir -> (ordenar (10) + hornear (10) + cocinar (40)) * 3 = 180
    // hacerReceta -> repetir (180) + desmoldar (10) + 10 * 1 = 200
    
    System.out.println(hacerReceta.getTarea());
    System.out.println(hacerReceta.getTiempo());

  }
}
