/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Administrador
 */
public class DadosPessoais {

    private int iddadospessoais;
    private String DataCadastro;
    private int Codigo;
    private String Nome;
    private String DataNascimento;
    private String EstadoCivil;
    private String Sexo;
    private String CPF;
    private String Endereco;
    private String Bairro;
    private String Cidade;
    private String UF;
    private String CEP;
    private String Complemento;
    private String telResidencial;
    private String telCelular;
    private String telRecado;
    private String email;
    private boolean DisponivelViagem;
    private boolean DisponivelMudanca;
    private boolean Deficiente;
    private String TipoDeficiência;
    private String DescricaoDeficiencia;
    private String OutrasInformacoes;

    public DadosPessoais(String DataCadastro, int Codigo, String Nome, String DataNascimento, String EstadoCivil, String Sexo, String CPF, String Endereco, String Bairro, String Cidade, String UF, String CEP, String Complemento, String telResidencial, String telCelular, String telRecado, String email, boolean DisponivelViagem, boolean DisponivelMudanca, boolean Deficiente, String TipoDeficiência, String DescricaoDeficiencia, String OutrasInformacoes) {
        this.DataCadastro = DataCadastro;
        this.Codigo = Codigo;
        this.Nome = Nome;
        this.DataNascimento = DataNascimento;
        this.EstadoCivil = EstadoCivil;
        this.Sexo = Sexo;
        this.CPF = CPF;
        this.Endereco = Endereco;
        this.Bairro = Bairro;
        this.Cidade = Cidade;
        this.UF = UF;
        this.CEP = CEP;
        this.Complemento = Complemento;
        this.telResidencial = telResidencial;
        this.telCelular = telCelular;
        this.telRecado = telRecado;
        this.email = email;
        this.DisponivelViagem = DisponivelViagem;
        this.DisponivelMudanca = DisponivelMudanca;
        this.Deficiente = Deficiente;
        this.TipoDeficiência = TipoDeficiência;
        this.DescricaoDeficiencia = DescricaoDeficiencia;
        this.OutrasInformacoes = OutrasInformacoes;
    }

    public DadosPessoais() {
    }
    
    public int getIddadospessoais() {
        return iddadospessoais;
    }

    public void setIddadospessoais(int iddadospessoais) {
        this.iddadospessoais = iddadospessoais;
    }

    public String getDataCadastro() {
        return DataCadastro;
    }

    public void setDataCadastro(String DataCadastro) {
        this.DataCadastro = DataCadastro;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(String DataNascimento) {
        this.DataNascimento = DataNascimento;
    }

    public String getEstadoCivil() {
        return EstadoCivil;
    }

    public void setEstadoCivil(String EstadoCivil) {
        this.EstadoCivil = EstadoCivil;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getComplemento() {
        return Complemento;
    }

    public void setComplemento(String Complemento) {
        this.Complemento = Complemento;
    }

    public String getTelResidencial() {
        return telResidencial;
    }

    public void setTelResidencial(String telResidencial) {
        this.telResidencial = telResidencial;
    }

    public String getTelCelular() {
        return telCelular;
    }

    public void setTelCelular(String telCelular) {
        this.telCelular = telCelular;
    }

    public String getTelRecado() {
        return telRecado;
    }

    public void setTelRecado(String telRecado) {
        this.telRecado = telRecado;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isDisponivelViagem() {
        return DisponivelViagem;
    }

    public void setDisponivelViagem(boolean DisponivelViagem) {
        this.DisponivelViagem = DisponivelViagem;
    }

    public boolean isDisponivelMudanca() {
        return DisponivelMudanca;
    }

    public void setDisponivelMudanca(boolean DisponivelMudanca) {
        this.DisponivelMudanca = DisponivelMudanca;
    }

    public boolean isDeficiente() {
        return Deficiente;
    }

    public void setDeficiente(boolean Deficiente) {
        this.Deficiente = Deficiente;
    }

    public String getTipoDeficiência() {
        return TipoDeficiência;
    }

    public void setTipoDeficiência(String TipoDeficiência) {
        this.TipoDeficiência = TipoDeficiência;
    }

    public String getDescricaoDeficiencia() {
        return DescricaoDeficiencia;
    }

    public void setDescricaoDeficiencia(String DescricaoDeficiencia) {
        this.DescricaoDeficiencia = DescricaoDeficiencia;
    }

    public String getOutrasInformacoes() {
        return OutrasInformacoes;
    }

    public void setOutrasInformacoes(String OutrasInformacoes) {
        this.OutrasInformacoes = OutrasInformacoes;
    }

}