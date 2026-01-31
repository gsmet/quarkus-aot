package fr.spacefox.perftests.quarkus.data.entity775;

import fr.spacefox.perftests.quarkus.core.port.data.Entity775DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service775.model.Model775;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity775Repository implements Entity775DatasourcePort, PanacheRepository<Entity775> {
    @Override
    public Optional<Model775> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
