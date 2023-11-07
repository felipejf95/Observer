import java.util.Observable;
import java.util.Observer;

public class Jogador implements Observer {

    private String nome;
    private String posicao;
    private int camisa;
    private String ultimaNotificacao;
    public Jogador(String nome, String posicao, int camisa) {
        this.nome = nome;
        this.posicao = posicao;
        this.camisa = camisa;
    }
    public String getUltimaNotificacao(){
        return this.ultimaNotificacao;
    }

    public void disponivel(Selecao selecao){
        selecao.addObserver(this);
    }

    public void update(Observable  selecao, Object arg1){
        this.ultimaNotificacao = this.nome + " convocado para a selecao do " + selecao.toString();
    }

}
