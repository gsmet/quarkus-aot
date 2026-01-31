package fr.spacefox.perftests.quarkus.data.entity36;

import fr.spacefox.perftests.quarkus.core.port.data.Entity36DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service36.model.Model36;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity36Repository implements Entity36DatasourcePort, PanacheRepository<Entity36> {
    @Override
    public Optional<Model36> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
