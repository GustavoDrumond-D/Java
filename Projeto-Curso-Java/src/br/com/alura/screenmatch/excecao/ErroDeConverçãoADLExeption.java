package br.com.alura.screenmatch.excecao;

public class ErroDeConverçãoADLExeption extends RuntimeException {
    private String mensagem;

    public ErroDeConverçãoADLExeption(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return this.mensagem;
    }
}
