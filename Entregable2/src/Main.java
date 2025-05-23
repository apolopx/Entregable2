//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class alumno {

    public String nombre;
    public double[] calif;

    public alumno(String nombre, double[] calif) {
        this.nombre = nombre;
        this.calif = calif;
    }


    public double getPromedio() {               //metodo A
        double suma = 0;
        for (double calificacion : calif) {
            suma += calificacion;
        }
        return suma / calif.length;
    }

    public char getNota(double promedio) {      //metodo B
        if (promedio <= 50) return 'F';
        else if (promedio <= 60) return 'E';
        else if (promedio <= 70) return 'D';
        else if (promedio <= 80) return 'C';
        else if (promedio <= 90) return 'B';
        else return 'A';
    }

    public void Imprimir(String nombre, double promedio, char cFinal) {             //metodo C
        System.out.println("Nombre del estudiante: " + nombre);
        for (int i = 0; i < calif.length; i++) {
            System.out.println("Calificación " + (i + 1) + ": " + calif[i]);
        }
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + cFinal);
    }

    public static void main(String[] args) {
        double[] calificaciones = {65, 72, 89, 58, 83}; // ejemplo de calificaciones
        alumno alumno1 = new alumno("Roberto", calificaciones);

        double promedio = alumno1.getPromedio();
        char calificacion = alumno1.getNota(promedio);
        alumno1.Imprimir(alumno1.nombre, promedio, calificacion);
    }

}


