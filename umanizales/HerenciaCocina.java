package co.edu.umanizales;

public class HerenciaCocina {
    public static void main(String[] args) {
        Olga olga = new Olga();
        Lyzeth lyzeth = new Lyzeth();
        Silvana silvana = new Silvana();

        // Demostración de herencia
        olga.cocinar();     // Olga cocina pasta
        lyzeth.cocinar();   // Lyzeth cocina agua hervida
        silvana.cocinar();  // Silvana cocina código
        silvana.programar(); // Silvana programa en Java

        // Demostración de polimorfismo
        System.out.println("\nDemostración de polimorfismo:");
        Olga persona1 = new Lyzeth();
        Olga persona2 = new Silvana();
        
        persona1.cocinar();  // Lyzeth cocina agua hervida
        persona2.cocinar();  // Silvana cocina código
        
        // La siguiente línea daría error de compilación
        // persona2.programar(); // No se puede llamar, el tipo de referencia es Olga
    }
}

class Olga {
    public void cocinar() {
        System.out.println("Olga cocina pasta");
    }
}

class Lyzeth extends Olga {
    @Override
    public void cocinar() {
        System.out.println("Lyzeth cocina agua hervida");
    }
}

class Silvana extends Lyzeth {
    @Override
    public void cocinar() {
        System.out.println("Silvana cocina código");
    }
    
    public void programar() {
        System.out.println("Silvana programa en Java");
    }
}
