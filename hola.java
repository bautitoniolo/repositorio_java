public class Holamundo { 
    public static void main(String[] args ) {
        System.out.print("Hola mundo");
        System.out.println("Hola mundo"); // salta a la siguiente pagina, pero el primer print tambien tiene que ser con ln 
    }
}

// acordate de las conversiones de datos, cuando definimos una variable tenemos que acordarnos de la cantidad de bits que tiene cada uno 
// esto lo hago mas que nada a forma de repaso, quiero tener bien frescos los temas viejos para poder seguir sin problemas 


public static void main(String [] args) {
    Scanner teclado = new Scnner(System.in);
    int valor; // en este caso es un entero, pero puede ser cualquier tipo de dato, por ejemplo double, float, char, etc.
    System.out.println("Ingrese un valor: ");
    valor = teclado.nextInt();
    System.out.println("El valor ingresado es: " + valor);
}

public class tematica {
    public static void main(String [] args) {
    int days;
    int semana;
    }
     { switch (days) {
        case 1:
            System.out.println("Lunes");
            break;
        case 2:
            System.out.println("Martes");
            break;
        case 3:
            System.out.println("Miercoles");
            break;
        case 4:
            System.out.println("Jueves");
            break;
        case 5:
            System.out.println("Viernes");
            break;
        case 6:
            System.out.println("Sabado");
            break;
        case 7:
            System.out.println("Domingo");
            break;
        default:
            System.out.println("Dia invalido");

    } {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero de semana: "); 
        semana = teclado.nextInt();

        if (semana > 0 ) {
            System.out.println("es la semana numero " + semana);
        } else {
            System.out.println("Semana invalida");
        }.    
    }


}
}


public class notas {
    public static void main(String [] args) {
       Scanner teclado = new Scanner(System.in);
       int[] notas = new int[5];
       int notaMaxima = 0;
       int aprobados = 0;
       int desaprobados = 0;
       int suma = 0;
         for (int i = 0; i < notas.length; i++) {
            System.out.println("Ingrese la nota " + (i + 1) + ": ");
            notas[i] = teclado.nextInt();
         } 
         for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        
            if (notas[i] >= 6) {
                aprobados++;
            } else {
                desaprobados++;
            }
            if (notas[i] > notaMaxima) {
                notaMaxima = notas[i];
            }
         }
        
         double promedio = (double) suma / notas.length;

        // Mostrar resultados
        System.out.println("----- RESULTADOS -----");

        System.out.println("Notas ingresadas:");
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }

        System.out.println("Promedio: " + promedio);
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Desaprobados: " + desaprobados);
        System.out.println("Nota mas alta: " + notaMaxima);

        teclado.close();
    }
}
    // este es un ejercicios de arrays, tengo aprender bien esa parte cuando me lo tomen en el examen
    


    class Contacto { 
        String nombre;
        String telefono;

        public Contacto(String nombre, String telefono) {
            this.nombre = nombre;
            this.telefono = telefono;
        }
        public void mostrarInformacion() {
            System.out.println("Nombre: " + nombre + " Teléfono: " + telefono);
        }
    }
        public class main { 
        public static void main(String[] args) {
        
          Contacto contacto1 = new Contacto("Juan", "123456789");
          Contacto contacto2 = new Contacto("María", "987654321");
          Contacto contacto3 = new Contacto("pedro",  "47976642");
          contacto1.mostrarInformacion();
          contacto2.mostrarInformacion();
          contacto3.mostrarInformacion();
           }
        }


    public String getNombre() {return nombre;} 
    public void setNombre(String nombre) {this.nombre = nombre;}
    public String setEdad(int edad) {
        if (edad >= 0) 
            this.edad = edad;
    }