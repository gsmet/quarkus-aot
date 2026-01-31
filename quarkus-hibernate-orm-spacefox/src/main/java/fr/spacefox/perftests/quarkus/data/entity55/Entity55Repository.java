package fr.spacefox.perftests.quarkus.data.entity55;

import fr.spacefox.perftests.quarkus.core.port.data.Entity55DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service55.model.Model55;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity55Repository implements Entity55DatasourcePort, PanacheRepository<Entity55> {
    @Override
    public Optional<Model55> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
