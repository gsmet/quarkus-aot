package fr.spacefox.perftests.quarkus.data.entity973;

import fr.spacefox.perftests.quarkus.core.port.data.Entity973DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service973.model.Model973;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity973Repository implements Entity973DatasourcePort, PanacheRepository<Entity973> {
    @Override
    public Optional<Model973> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
