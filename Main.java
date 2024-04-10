package actividadPOO;

public class Main {

    public static void main(String[] args) {
        
        Persona Andres = new Persona("Andres", 19, 'H');
        
        Andres.setPeso(150);
        Andres.setAltura(1.80f);
        
        System.out.println(Andres.calcularIMC());
        System.out.println(Andres.comprobarSexo('H'));
        System.out.println(Andres.esMayorDeEdad());
        
        System.out.println(Andres.toString());
        
    }
    
}
