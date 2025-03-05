package AnimaisESons;

public class Gato extends Animal implements Alimentavel {
    @Override
    void fazerSom() {
        System.out.println("Miau");
    }
    
    @Override
    public void alimentar() {
        System.out.println("Alimentando o gato.");
    }
}
