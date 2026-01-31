package fr.spacefox.perftests.quarkus.data.entity942;

import fr.spacefox.perftests.quarkus.core.port.data.Entity942DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service942.model.Model942;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity942Repository implements Entity942DatasourcePort, PanacheRepository<Entity942> {
    @Override
    public Optional<Model942> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
