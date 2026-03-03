void main()
{
    //Java cosas
    String version = "v1";
    Map<Integer, String> listaTareas = new HashMap<Integer, String>();
    int posicion = 0;
    IO.println("Gestor de tareas "+version);
    while (true)
    {
        IO.println("1.- Agregar tarea");
        IO.println("2.- Eliminar tarea");
        IO.println("3.- Mostrar tareas");
        IO.println("4.- Salir");
        int opcion = Integer.parseInt(IO.readln("Ingresa la opcion: "));
        if (opcion == 1)
        {
            String nuevaTarea = IO.readln("Cual es la tarea que deseas agregar? ");
            listaTareas.put(posicion+=1,nuevaTarea);
        }
        if(opcion==2)
        {
            int opcionEliminar = Integer.parseInt(IO.readln("Ingresa el numero de la tarea que quieres eliminar"));
            listaTareas.remove(opcionEliminar);
        }
        if(opcion==3)
        {
            IO.println(listaTareas);
        }
        if(opcion==4)
        {
            IO.println("Gracias por usar el sistema de tareas " + version);
            break;
        }
    }


}

