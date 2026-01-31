package fr.spacefox.perftests.quarkus.data.entity139;

import fr.spacefox.perftests.quarkus.core.port.data.Entity139DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service139.model.Model139;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity139Repository implements Entity139DatasourcePort, PanacheRepository<Entity139> {
    @Override
    public Optional<Model139> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
