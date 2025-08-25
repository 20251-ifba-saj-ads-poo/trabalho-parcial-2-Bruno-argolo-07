import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ClienteDAO extends GenericDAOImpl<Cliente> {
    public List<Cliente> buscarOrdenadosPorNome() {
        return buscarTodos()
                .stream()
                .sorted(Comparator.comparing(Cliente::getNome))
                .collect(Collectors.toList());
    }
}
