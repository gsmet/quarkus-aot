package fr.spacefox.perftests.quarkus.data.entity958;

import fr.spacefox.perftests.quarkus.core.port.data.Entity958DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service958.model.Model958;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity958Repository implements Entity958DatasourcePort, PanacheRepository<Entity958> {
    @Override
    public Optional<Model958> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
