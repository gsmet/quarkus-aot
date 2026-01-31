package fr.spacefox.perftests.quarkus.data.entity657;

import fr.spacefox.perftests.quarkus.core.port.data.Entity657DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service657.model.Model657;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity657Repository implements Entity657DatasourcePort, PanacheRepository<Entity657> {
    @Override
    public Optional<Model657> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
