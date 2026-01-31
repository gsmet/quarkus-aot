package fr.spacefox.perftests.quarkus.data.entity653;

import fr.spacefox.perftests.quarkus.core.port.data.Entity653DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service653.model.Model653;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity653Repository implements Entity653DatasourcePort, PanacheRepository<Entity653> {
    @Override
    public Optional<Model653> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
