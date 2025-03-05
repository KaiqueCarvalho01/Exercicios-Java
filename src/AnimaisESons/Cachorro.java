package AnimaisESons;

public class Cachorro extends Animal implements Alimentavel {
    @Override
    void fazerSom() {
        System.out.println("Au au");
    }
    @Override
    public void alimentar() {
        System.out.println("Alimentando o cachorro.");
    }
    
}
