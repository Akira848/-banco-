/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alunos
 */
public class endereco {
    private String rua;
    private String numero;
    private cidade cidade;

    public cidade getCidade() {
        return cidade;
    }

    public void setCidade(cidade cidade) {
        this.cidade = cidade;
    }

    
    public endereco(String rua, String numero) {
        this.rua = rua;
        this.numero = numero;
    }
    
    public String getRua() {
        return rua;
    }

    public String getNumero() {
        return numero;
    }
    
    
}


