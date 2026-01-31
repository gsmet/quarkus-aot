package fr.spacefox.perftests.quarkus.data.entity31;

import fr.spacefox.perftests.quarkus.core.port.data.Entity31DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service31.model.Model31;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity31Repository implements Entity31DatasourcePort, PanacheRepository<Entity31> {
    @Override
    public Optional<Model31> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
