import apps.NavegadorDeInternet;
import apps.ReprodutorMusical;
import funcionalidades.AparelhoTelefonico;

public class IphoneAparelho implements NavegadorDeInternet, ReprodutorMusical, AparelhoTelefonico {
    @Override
    public void exibirPagina() {
        System.out.println("Página Exibida!");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Aba adicionada!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada!");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausado.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Música selecionada!");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo...");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Correio de voz iniciado!");
    }
}
