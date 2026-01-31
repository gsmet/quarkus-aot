package fr.spacefox.perftests.quarkus.data.entity677;

import fr.spacefox.perftests.quarkus.core.port.data.Entity677DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service677.model.Model677;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity677Repository implements Entity677DatasourcePort, PanacheRepository<Entity677> {
    @Override
    public Optional<Model677> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
