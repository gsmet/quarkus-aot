package fr.spacefox.perftests.quarkus.data.entity0;

import fr.spacefox.perftests.quarkus.core.port.data.Entity0DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service0.model.Model0;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity0Repository implements Entity0DatasourcePort, PanacheRepository<Entity0> {
    @Override
    public Optional<Model0> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
