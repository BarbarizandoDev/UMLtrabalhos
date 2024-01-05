package exercicio;

// Interface para os exercícios
interface Exercicio {
    String descricao();
}

// Implementações de exercícios de corrida
class ExercicioCorridaResistencia implements Exercicio {
    @Override
    public String descricao() {
        return "Exercício de corrida de resistência";
    }
}

class ExercicioCorridaVelocidade implements Exercicio {
    @Override
    public String descricao() {
        return "Exercício de corrida de velocidade";
    }
}

// Implementações de exercícios de musculação
class ExercicioMusculacaoResistencia implements Exercicio {
    @Override
    public String descricao() {
        return "Exercício de musculação de resistência";
    }
}

class ExercicioMusculacaoVelocidade implements Exercicio {
    @Override
    public String descricao() {
        return "Exercício de musculação de velocidade";
    }
}

// Interface da fábrica abstrata
interface FabricaExercicios {
    Exercicio criarExercicio();
}

// Fábricas concretas para corrida e musculação
class FabricaCorridaResistencia implements FabricaExercicios {
    public Exercicio criarExercicio() {
        return new ExercicioCorridaResistencia();
    }
}

class FabricaCorridaVelocidade implements FabricaExercicios {
    @Override
    public Exercicio criarExercicio() {
        return new ExercicioCorridaVelocidade();
    }
}

class FabricaMusculacaoResistencia implements FabricaExercicios {
    @Override
    public Exercicio criarExercicio() {
        return new ExercicioMusculacaoResistencia();
    }
}

class FabricaMusculacaoVelocidade implements FabricaExercicios {
    @Override
    public Exercicio criarExercicio() {
        return new ExercicioMusculacaoVelocidade();
    }
}

public class AcademiaApp {
    public static void main(String[] args) {
        // Criação de exercícios usando a fábrica
        FabricaExercicios fabrica = new FabricaCorridaResistencia();
        Exercicio exercicio = fabrica.criarExercicio();
        System.out.println(exercicio.descricao());
    }
}

