package fr.spacefox.perftests.quarkus.data.entity34;

import fr.spacefox.perftests.quarkus.core.port.data.Entity34DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service34.model.Model34;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity34Repository implements Entity34DatasourcePort, PanacheRepository<Entity34> {
    @Override
    public Optional<Model34> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
