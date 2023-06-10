package funcionarios;

import clientes.Cliente;

public class FuncionariosPrincipal {
    Funcionario[] funcionarios = {
            new Funcionario("Elaine Cruz", 36),
            new Funcionario("Lara Schneider", 20),
            new Funcionario("Diego Schneider", 35)
    };

    Cliente[] clientes = {
            new Cliente("LC Personalizados e Variedades", 2_000_000),
            new Cliente("L.Cruz Cosméticos", 25_000_000),
            new Cliente("L.C Artes", 3_000_000),
    };
}
