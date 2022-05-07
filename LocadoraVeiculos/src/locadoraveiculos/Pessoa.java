
package locadoraveiculos;

import java.util.Date;
import java.util.Set;


public abstract class Pessoa {

    private String nome;
    
    private Date nascimento;
    
    private Set<Locacao> locacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public Set<Locacao> getLocacao() {
        return locacao;
    }

    public void setLocacao(Set<Locacao> locacao) {
        this.locacao = locacao;
    }
    
    
}
