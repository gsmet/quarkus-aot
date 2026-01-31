package fr.spacefox.perftests.quarkus.data.entity813;

import fr.spacefox.perftests.quarkus.core.port.data.Entity813DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service813.model.Model813;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity813Repository implements Entity813DatasourcePort, PanacheRepository<Entity813> {
    @Override
    public Optional<Model813> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
