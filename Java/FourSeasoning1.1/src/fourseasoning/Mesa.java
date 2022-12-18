package fourseasoning;


public class Mesa {
    private byte num, qtdCadeiras;
    private boolean disponibilidade;
    private int tempoEspera;
    private String area;


    public Mesa(){
        
    }
    
    public Mesa(byte num){
        this.num = num;
    }
    
    public Mesa(byte num, byte qtdCadeiras, boolean disponibilidade, int tempoEspera){
        this.num = num;
        this.qtdCadeiras = qtdCadeiras;
        this.disponibilidade = disponibilidade;
        this.tempoEspera = tempoEspera;
    }

    public Mesa(byte num, byte qtdCadeiras, boolean disponibilidade, int tempoEspera, String area) {
        this.num = num;
        this.qtdCadeiras = qtdCadeiras;
        this.disponibilidade = disponibilidade;
        this.tempoEspera = tempoEspera;
        this.area = area;
    }
    
    public byte getNum() {
        return num;
    }

    public void setNum(byte num) {
        this.num = num;
    }

    public byte getQtdCadeiras() {
        return qtdCadeiras;
    }

    public void setQtdCadeiras(byte qtdCadeiras) {
        this.qtdCadeiras = qtdCadeiras;
    }

    public boolean getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getTempoEspera() {
        return tempoEspera;
    }

    public void setTempoEspera(int tempoEspera) {
        this.tempoEspera = tempoEspera;
    }

    @Override
    public String toString() {
        return (this.num == 0 ? "Mesa não existe" : "Mesa número: " + this.num + 
                "\nCom " + this.qtdCadeiras + " cadeiras" + "\nÁrea: " + this.area + 
                ((this.disponibilidade) ? "\nDisponível" : "\nIndisponível\nEstimativa de espera: " 
                + this.tempoEspera));
    }
    
    
}
