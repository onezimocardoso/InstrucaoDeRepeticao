package InstrucaoDeRepeticao;

public class Estudante {
    // variáveis de instância
    private String nome;
    private float media;

    //construtor

    public Estudante(String nome,float media){
        this.nome = nome;
        if(media > 0.0 && media <= 10)
            this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        if(media > 0.0 && media <= 10)
            this.media = media;
        else
            System.out.println("Valor " +
                    "invalido para media.");
    }
}
