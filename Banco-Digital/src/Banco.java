import lombok.Getter;

import java.util.List;

@Getter
public class Banco {
  private String nome;
  private List<Conta> contas;
  private List<Cliente> clientes;
}

