
public class AcademiaApp {
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // Criação de exercícios usando a fábrica
        FabricaExercicios fabrica;
        fabrica = new FabricaCorridaResistencia();
        Exercicio exercicio = fabrica.criarExercicio();
        System.out.println(exercicio.descricao());
    }
}
