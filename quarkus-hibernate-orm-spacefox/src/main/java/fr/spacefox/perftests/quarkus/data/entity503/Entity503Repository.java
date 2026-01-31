package fr.spacefox.perftests.quarkus.data.entity503;

import fr.spacefox.perftests.quarkus.core.port.data.Entity503DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service503.model.Model503;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity503Repository implements Entity503DatasourcePort, PanacheRepository<Entity503> {
    @Override
    public Optional<Model503> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
