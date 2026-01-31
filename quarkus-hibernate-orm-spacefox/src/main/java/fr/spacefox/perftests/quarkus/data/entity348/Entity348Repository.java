package fr.spacefox.perftests.quarkus.data.entity348;

import fr.spacefox.perftests.quarkus.core.port.data.Entity348DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service348.model.Model348;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity348Repository implements Entity348DatasourcePort, PanacheRepository<Entity348> {
    @Override
    public Optional<Model348> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
