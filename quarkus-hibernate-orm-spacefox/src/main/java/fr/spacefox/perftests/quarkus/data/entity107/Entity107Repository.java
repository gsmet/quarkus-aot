package fr.spacefox.perftests.quarkus.data.entity107;

import fr.spacefox.perftests.quarkus.core.port.data.Entity107DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service107.model.Model107;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity107Repository implements Entity107DatasourcePort, PanacheRepository<Entity107> {
    @Override
    public Optional<Model107> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
