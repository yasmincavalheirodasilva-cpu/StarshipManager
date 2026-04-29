public class Main {
    public static void main (String[] args) {

        Nave nave = new Nave ("Millennium Falcon", 100);
    
        Tripulante t1 = new Tripulante ("Han solo", "Piloto");
        Tripulante t2 = new Tripulante ("Chewbacca", "Co-piloto");
    
        nave.adicionarTripulante(t1);
        nave.adicionarTripulante(t2);
    
        nave.viajar(50);
    
        nave.exibirStatus();
    }
    } 
