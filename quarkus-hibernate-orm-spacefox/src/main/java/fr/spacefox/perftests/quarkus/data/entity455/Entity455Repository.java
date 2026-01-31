package fr.spacefox.perftests.quarkus.data.entity455;

import fr.spacefox.perftests.quarkus.core.port.data.Entity455DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service455.model.Model455;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity455Repository implements Entity455DatasourcePort, PanacheRepository<Entity455> {
    @Override
    public Optional<Model455> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
