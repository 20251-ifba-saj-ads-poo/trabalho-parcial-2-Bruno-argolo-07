public class GenericDAOImpl<T extends AbstractModel> implements GenericDAO<T> {
    private Map<UUID, T> bancoDeDados = new HashMap<>();

    @Override
    public UUID salvar(T entidade, String usuario) {
        UUID novoId = UUID.randomUUID();
        entidade.setId(novoId);
        entidade.setCreatedAt(LocalDateTime.now());
        entidade.setCreatedBy(usuario);
        bancoDeDados.put(novoId, entidade);
        return novoId;
    }

    @Override
    public void atualizar(T entidade, String usuario) {
        entidade.setUpdatedAt(LocalDateTime.now());
        entidade.setUpdatedBy(usuario);
        bancoDeDados.put(entidade.getId(), entidade);
    }

    @Override
    public T buscarPorId(UUID id) {
        return bancoDeDados.get(id);
    }

    @Override
    public void deletar(UUID id) {
        bancoDeDados.remove(id);
    }

    @Override
    public List<T> buscarTodos() {
        return new ArrayList<>(bancoDeDados.values());
    }
}
