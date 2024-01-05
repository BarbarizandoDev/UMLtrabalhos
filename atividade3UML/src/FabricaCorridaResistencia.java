

class FabricaCorridaResistencia implements FabricaExercicios {
    public Exercicio criarExercicio() {
        return new ExercicioCorridaResistencia();
    }
}

class FabricaCorridaVelocidade implements FabricaExercicios {
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

