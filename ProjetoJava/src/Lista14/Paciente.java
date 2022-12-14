package Lista14;

public class Paciente {

    private String cpf;
    private String nome;
    private char sexo;
    private double peso;
    private double altura;

    public Paciente() {

    }

    public Paciente(String cpf, String nome, char sexo, double peso, double altura) {
        this.cpf = cpf;
        this.nome = nome;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Cpf: " + cpf + "\nNome: " + nome + "\nSexo: " + sexo
                + "\nPeso: " + peso + "\nAltura: " + altura;
    }
    
    public double calcularImc() {
        return peso / (altura * altura);
    }
    
    public double calcularPesoIdeal() {
        if (sexo == 'm') {
            return 72.7 * altura - 58;
        } else {
            return 62.1 * altura - 44.72;
        }
    }
}
