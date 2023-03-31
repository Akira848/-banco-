/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alunos
 */
public class pessoa {
    private String nome;
    private String dataDeNascimento;
    private endereco endereco;
    private contaBancaria contaBancaria;

    public endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(endereco endereco) {
        this.endereco = endereco;
    }

    public contaBancaria getContaBancaria() {
        return contaBancaria;
    }

    public void setContaBancaria(contaBancaria contaBancaria) {
        this.contaBancaria = contaBancaria;
    }
    
    

    public pessoa(String nome, String dataDeNascimento) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }
    
    public String getNome() {
        return nome;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }
     
    
    
}
