package fr.spacefox.perftests.quarkus.data.entity623;

import fr.spacefox.perftests.quarkus.core.port.data.Entity623DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service623.model.Model623;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity623Repository implements Entity623DatasourcePort, PanacheRepository<Entity623> {
    @Override
    public Optional<Model623> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
