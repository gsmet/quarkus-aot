package fr.spacefox.perftests.quarkus.data.entity661;

import fr.spacefox.perftests.quarkus.core.port.data.Entity661DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service661.model.Model661;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity661Repository implements Entity661DatasourcePort, PanacheRepository<Entity661> {
    @Override
    public Optional<Model661> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
