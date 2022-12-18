package fourseasoning;


public class ItemPedido {
    private String tamanho;
    private byte qtd;
    private double subtotal;
    private Prato prato;
    
    public ItemPedido() {
    }

    public ItemPedido(String tamanho, byte qtd, double subtotal) {
        this.tamanho = tamanho;
        this.qtd = qtd;
        this.subtotal = subtotal;
    }

    public ItemPedido(String tamanho, byte qtd, double subtotal, Prato prato) {
        this.tamanho = tamanho;
        this.qtd = qtd;
        this.subtotal = subtotal;
        this.prato = prato;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public byte getQtd() {
        return qtd;
    }

    public void setQtd(byte qtd) {
        this.qtd = qtd;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public Prato getPrato() {
        return prato;
    }

    public void setPrato(Prato prato) {
        this.prato = prato;
    }
    
    
}
