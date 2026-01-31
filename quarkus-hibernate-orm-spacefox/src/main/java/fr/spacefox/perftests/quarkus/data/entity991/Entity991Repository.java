package fr.spacefox.perftests.quarkus.data.entity991;

import fr.spacefox.perftests.quarkus.core.port.data.Entity991DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service991.model.Model991;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity991Repository implements Entity991DatasourcePort, PanacheRepository<Entity991> {
    @Override
    public Optional<Model991> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
