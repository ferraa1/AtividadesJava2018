package Lista13;

public class Automovel {
    private String marca;
    private String modelo;
    private String cor;
    private int ano;
    private double combustivel;
    private double velocidade;
    
    public Automovel() {
    
    }
    
    public Automovel(String marca, String modelo, String cor, int ano, double combustivel, double velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.combustivel = combustivel;
        this.velocidade = velocidade;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public String getCor() {
        return cor;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public int getAno() {
        return ano;
    }
    
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public double getCombustivel() {
        return combustivel;
    }
    
    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }
    
    public double getVelocidade() {
        return velocidade;
    }
    
    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
    
    @Override
    public String toString() {
        return "Marca: " + marca + " Modelo: " + modelo + " Cor: " + cor
                + " Ano: " + ano + " Combustível: " + combustivel
                + " Velocidade: " + velocidade;
    }
    
    public void acelerar(double num) {
        if (combustivel > 0 && (combustivel - num) >= 0) {
            velocidade += num;
            combustivel -= num;
        } else {
            System.out.println("Este veículo não tem combustível suficiente.");
        }
    }
    
    public void frear(double num) {
        velocidade -= num;
        if (velocidade < 0) {
            velocidade = 0;
        }
    }
}
