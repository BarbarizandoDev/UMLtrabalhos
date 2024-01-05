package supermercado;

public class ProdutoController {

    private ValidadorProduto validador;
    private Mensageiro mensageiro;
    private BancoDeDados bancoDeDados;

    public ProdutoController(ValidadorProduto validador, Mensageiro mensageiro, BancoDeDados bancoDeDados) {
        this.validador = validador;
        this.mensageiro = mensageiro;
        this.bancoDeDados = bancoDeDados;
    }

    ProdutoController() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean salvarProduto(ProdutoEntity produto) {
        if (validador.validar(produto)) {
            bancoDeDados.salvar(produto);
            mensageiro.enviarMensagem("Produto salvo com sucesso.");
            return true;
        } else {
            return false;
        }
    }
}

interface ValidadorProduto {
    boolean validar(ProdutoEntity produto);
}

interface Mensageiro {
    void enviarMensagem(String mensagem);
}

interface BancoDeDados {
    void salvar(ProdutoEntity produto);
}

