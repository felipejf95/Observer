import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JogadorTest {

    @Test
    public void deveNotificarJogadorConvocado(){
        Jogador jogador = new Jogador("Joao", "Atacante", 10);
        Selecao selecao = new Selecao("Brasil");
        jogador.disponivel(selecao);
        selecao.convocar();
        assertEquals("Joao convocado para a selecao do Brasil", jogador.getUltimaNotificacao());
    }

    @Test
    public void naoDeveNotificarJogador(){
        Jogador jogador = new Jogador("Joao", "Atacante", 10);
        Selecao selecao = new Selecao("Brasil");
        selecao.convocar();
        assertEquals(null, jogador.getUltimaNotificacao());
    }

    @Test
    public void deveNotificarTodosJogadores(){
        Jogador jogador1 = new Jogador("Joao", "Atacante", 10);
        Jogador jogador2 = new Jogador("Cesar", "Zagueiro", 3);

        Selecao selecao = new Selecao("Brasil");
        jogador1.disponivel(selecao);
        jogador2.disponivel(selecao);
        selecao.convocar();
        assertEquals("Joao convocado para a selecao do Brasil", jogador1.getUltimaNotificacao());
        assertEquals("Cesar convocado para a selecao do Brasil", jogador2.getUltimaNotificacao());
    }

    @Test
    public void deveNotificarSomenteJogador1() {
        Jogador jogador1 = new Jogador("Joao", "Atacante", 10);
        Jogador jogador2 = new Jogador("Cesar", "Zagueiro", 3);

        Selecao selecao1 = new Selecao("Brasil");
        Selecao selecao2 = new Selecao("Argentina");

        jogador1.disponivel(selecao1);
        jogador2.disponivel(selecao2);
        selecao1.convocar();
        assertEquals("Joao convocado para a selecao do Brasil", jogador1.getUltimaNotificacao());
        assertEquals(null, jogador2.getUltimaNotificacao());
    }

}