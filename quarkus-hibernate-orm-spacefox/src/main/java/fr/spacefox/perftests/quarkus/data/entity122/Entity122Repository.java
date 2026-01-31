package fr.spacefox.perftests.quarkus.data.entity122;

import fr.spacefox.perftests.quarkus.core.port.data.Entity122DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service122.model.Model122;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity122Repository implements Entity122DatasourcePort, PanacheRepository<Entity122> {
    @Override
    public Optional<Model122> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
