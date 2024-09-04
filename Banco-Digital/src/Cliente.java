import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Cliente {

  private String nome;
  private String cpf;
  private String endereco;
  private String telefone;

  private List<Conta> contas;

  public Cliente(String nome, String cpf, String telefone, String endereco) {
    this.nome = nome;
    this.cpf = cpf;
    this.telefone = telefone;
    this.endereco = endereco;
  }

}
