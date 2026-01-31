package fr.spacefox.perftests.quarkus.data.entity166;

import fr.spacefox.perftests.quarkus.core.port.data.Entity166DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service166.model.Model166;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity166Repository implements Entity166DatasourcePort, PanacheRepository<Entity166> {
    @Override
    public Optional<Model166> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
