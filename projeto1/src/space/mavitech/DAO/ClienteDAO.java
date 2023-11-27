package space.mavitech.DAO;

import space.mavitech.domain.Cliente;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ClienteDAO implements IClienteDAO {

    private Map<Long, Cliente> clienteDAO;

    public ClienteDAO() {
        this.clienteDAO = new HashMap<>();
    }

    @Override
    public Boolean cadastrar(Cliente cliente) {
        if (this.clienteDAO.containsKey(cliente.getCpf())) {
            return false;
        }
        this.clienteDAO.put(cliente.getCpf(), cliente);
        return true;
    }

    @Override
    public void excluir(Long cpf) {
        Cliente clienteCadastrado = this.clienteDAO.get(cpf);
        if (clienteCadastrado != null) {
            this.clienteDAO.remove(clienteCadastrado.getCpf(), clienteCadastrado);
        }
    }

    @Override
    public void alterar(Cliente cliente) {
        Cliente clienteCadastrado = this.clienteDAO.get(cliente.getCpf());
        if (clienteCadastrado != null) {
            clienteCadastrado.setNome(cliente.getNome());
            clienteCadastrado.setTel(cliente.getTel());
            clienteCadastrado.setNumero(cliente.getNumero());
            clienteCadastrado.setEnd(cliente.getEnd());
            clienteCadastrado.setCidade(cliente.getCidade());
            clienteCadastrado.setEstado(cliente.getEstado());
        }
    }

    @Override
    public Cliente consultar(Long cpf) {
        return this.clienteDAO.get(cpf);
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return this.clienteDAO.values();
    }

}
