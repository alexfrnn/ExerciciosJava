public class Arquivos{
    private String nomeArquivo;
    private int tamanho;
    private String formato;


    public String getNomeArquivo() {
        return nomeArquivo;
    }
    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }
    public int getTamanho() {
        return tamanho;
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    public String getFormato() {
        return formato;
    }
    public void setFormato(String formato) {
        this.formato = formato;
    }
    
    public void anexar(){
        System.out.println("retorno anexar");
    }

    public void remover(){
        System.out.println("retorno remover");
    }

}
