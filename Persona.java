import java.util.Random;

public class Persona {
 
    private String nombre;
    private int edad;
    private String cedula;
    private char sexo;
    private float peso;
    private float altura;

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = "";
        this.edad = 0;
        this.cedula = this.crearCedula();
        this.sexo = 'H';
        this.peso = 0;
        this.altura = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCedula() {
        return cedula;
    }

    public char getSexo() {
        return sexo;
    }

    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public int calcularIMC (){
        
        double imc = this.peso / (Math.pow(this.altura, 2));
        
        int indice = 0;
        
        if (imc < 20){
            
            indice =  -1;
            
        }
        else if (imc >= 20 && imc <= 25){
            
            indice = 0;
            
        }
        else if (imc > 25){
            
            indice = 1;
            
        }
        
        return indice;
        
    }
    
    public String crearCedula (){
        
        Random aleatorio = new Random(System.currentTimeMillis());
        
        int numero = aleatorio.nextInt(1000000000)+1000000000;
        
        return numero + "";
        
    }
    
    public boolean esMayorDeEdad(){
     
        boolean mayor = false;
        
        if (this.edad < 18){
            
            mayor = false;
            
        }
        else if (this.edad >= 18){
            
            mayor = true;
            
        }
        
        return mayor;
        
    }

    public char comprobarSexo(char sexo){
        
        char minuscula = Character.toLowerCase(sexo);
        
        if (minuscula == 'h' || minuscula == 'm'){
            
            return sexo;
            
        }
        else{
            
            return 'H';
        }
        
    }
    
    @Override
    public String toString() {
        return "Persona{" + "Cedula=" + cedula + ", Sexo=" + sexo + ", Peso=" + peso + ", Altura=" + altura + '}';
    }
    
}