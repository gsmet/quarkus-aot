package fr.spacefox.perftests.quarkus.data.entity827;

import fr.spacefox.perftests.quarkus.core.port.data.Entity827DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service827.model.Model827;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity827Repository implements Entity827DatasourcePort, PanacheRepository<Entity827> {
    @Override
    public Optional<Model827> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
