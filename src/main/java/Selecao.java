import java.util.Observable;

public class Selecao extends Observable {

    private String nome;

    public Selecao(String nome) {
        this.nome = nome;
    }

    public void convocar(){
        setChanged();
        notifyObservers();
    }


    public String toString(){
        return this.nome;
    }
}
