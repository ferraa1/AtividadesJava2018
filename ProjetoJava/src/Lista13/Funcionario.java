package Lista13;

import java.util.Calendar;

public class Funcionario {

    private String nome;
    private String dataNascimento;
    private String tipoContrato;
    private double valorHora;
    private int filhosMenores;
    private String dataAdmissao;

    public Funcionario() {

    }

    public Funcionario(String nome, String dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getFilhosMenores() {
        return filhosMenores;
    }

    public void setFilhosMenores(int filhosMenores) {
        this.filhosMenores = filhosMenores;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | Data de nascimento: " + dataNascimento
                + " | Tipo de contrato: " + tipoContrato
                + " | Valor da hora trabalhada: " + valorHora
                + " | Quantidade de filhos menores de idade: " + filhosMenores
                + " | Data de admissão: " + dataAdmissao;
    }

    public void Contratar(String tipoContrato, double valorHora, int filhosMenores, String dataAdmissao) {
        this.tipoContrato = tipoContrato;
        this.valorHora = valorHora;
        this.filhosMenores = filhosMenores;
        this.dataAdmissao = dataAdmissao;
    }

    public double bruto(double horas) {
        return horas * valorHora;
    }

    public double inss(double bruto) {
        if (bruto < 1659.39) {
            return 0.08;
        } else if (bruto < 2765.67) {
            return 0.09;
        } else if (bruto < 5531.32) {
            return 0.11;
        } else {
            return 0;
        }
    }

    public double plus() {
        double adicional = 0;
        int anoNascimento = Integer.parseInt(dataNascimento.substring(6));
        int anoAdmissao = Integer.parseInt(dataAdmissao.substring(6));
        Calendar c = Calendar.getInstance();
        int anoAtual = c.get(Calendar.YEAR);
        //Calendar calendario = new GregorianCalendar();
        //int anoAtual = calendario.get(Calendar.YEAR);
        int idade = anoAtual - anoNascimento;
        int tempoServico = anoAtual - anoAdmissao;
        if (idade > 40) {
            adicional += 0.02;
        }
        if (tempoServico > 15) {
            adicional += 0.035;
        } else if (tempoServico > 5 && idade > 30) {
            adicional += 0.015;
        }
        return adicional;
    }
    
    public double liquido(double bruto, double inss, double plus) {
        return bruto * (1 - inss + plus);
    }
    
    public void folhaPagamento(String nome, double bruto, double inss, double plus, double liquido) {
        System.out.println("Folha de pagamento do funcionário: " + nome +
                " | Salário bruto: " + bruto + " | Desconto: " + inss +
                " | Adicional: " + plus + " | Salário líquido: " + liquido);
    }
}
