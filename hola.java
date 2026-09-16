public class hola {
    public static void main(String[] args) {
        System.out.println("Hola, mundo!");
    }           
}

public class alumnos {
    primer_alumno alumno1 = new primer_alumno("Juan", 20);  

} public class primer_alumno {
    private String nombre;
    private int edad;

    public primer_alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}

public class variables {
    static int n = 4;
    static int x = 5;
    static int sum = n + x;
    public static void main(String[] args)} {
        system.out.println("La suma es: " + sum);
    }

    return sum; 
       for (int i = 0 ; i < 10 ; i++) {
        system.out.println("El valor de i es: " + i);
}


 public class auto {
    private String auto;
    static int patente;
    static String marca;
     
    public static void main(String[] args) {
        auto miAuto = new auto();
        miAuto.auto = "Toyota";
        miAuto.patente = 1234;
        miAuto.marca = "Corolla";

        System.out.println("Mi auto es un " + miAuto.marca + " con patente " + miAuto.patente);
    }
    
 }

 public class persona { 
    private String nombre;
    static int edad;
    static float altura; 
    static float peso; 
    private String direccion;
    private String telefono;
    private String correo;

    public persona(String nombre, int edad, float altura, float peso, String direccion, String telefono, String correo) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }
 }

 public class estudiante extends persona {
    private String carrera;
    private int anioIngreso;

    public estudiante(String nombre, int edad, float altura, float peso, String direccion, String telefono, String correo, String carrera, int anioIngreso) {
        super(nombre, edad, altura, peso, direccion, telefono, correo);
        this.carrera = carrera;
        this.anioIngreso = anioIngreso;
    }

    public String getCarrera() {
        return carrera;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }
 }

 public class ano-bisiesto {
    public static void main(String[] args) {
        int year = 2024;
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " es un año bisiesto.");
        } else {
            System.out.println(year + " no es un año bisiesto.");
        }
    }
 }

 public class contador {
    public static void main(String [] args) {
        int n = 10;
        for (int i = 0 ; i < n ; i++) {
            System.out.println("El valor de i es: " + i);   
        }
    }
 }

 public class suma { 
    public static void main(String [] args)
{
    int n = 10;
    int z = 20;

    {
     int sum = n + z;
        System.out.println("La suma es: " + sum);
    }
}
 }

 public class persona {

    public static void main(string [] args); {
      Scanners edad = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
       int edad = edad.nextInt();
 
    }
 }

public class calculoMatemtico { 
    public static void calculoMatemtico (String [] args){
      Scanners num1 = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int num1 = num1.nextInt();
        Scanners num2 = new Scanner(System.in);
        System.out.println("Ingrese el segundo numero: ");      
        Scanners suma = new Scanner(System.in);
        double suma = num1 + num2; 
        System.out.println("La suma es: " + suma);
    } 
}



public class mayorEdad {
    public static void main(String [] args );
    int n = 18; 
    for (int n = 0 ; n < 10 ; n++) {
        if (n >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }
}


public class ejemplo{ 
    public static void main(String [] args)  {
    System.out.println("Ingrese su correo electronico: ");
    String email = email.next.Line();
    if (email.equals(email)) {
        System.out.println("El correo electronico es correcto");
    } else {
        System.out.println("El correo electronico es incorrecto"); 
    }
}