package fr.spacefox.perftests.quarkus.data.entity918;

import fr.spacefox.perftests.quarkus.core.port.data.Entity918DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service918.model.Model918;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity918Repository implements Entity918DatasourcePort, PanacheRepository<Entity918> {
    @Override
    public Optional<Model918> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
