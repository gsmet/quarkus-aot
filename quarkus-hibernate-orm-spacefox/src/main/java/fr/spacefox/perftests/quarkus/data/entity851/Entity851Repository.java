package fr.spacefox.perftests.quarkus.data.entity851;

import fr.spacefox.perftests.quarkus.core.port.data.Entity851DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service851.model.Model851;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity851Repository implements Entity851DatasourcePort, PanacheRepository<Entity851> {
    @Override
    public Optional<Model851> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
