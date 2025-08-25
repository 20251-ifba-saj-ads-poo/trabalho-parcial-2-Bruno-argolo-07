import java.time.LocalDateTime;
import java.util.*;

public interface GenericDAO<T extends AbstractModel> {
    UUID salvar(T entidade, String usuario);
    void atualizar(T entidade, String usuario);
    T buscarPorId(UUID id);
    void deletar(UUID id);
    List<T> buscarTodos();
}
