package fr.spacefox.perftests.quarkus.data.entity541;

import fr.spacefox.perftests.quarkus.core.port.data.Entity541DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service541.model.Model541;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity541Repository implements Entity541DatasourcePort, PanacheRepository<Entity541> {
    @Override
    public Optional<Model541> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
