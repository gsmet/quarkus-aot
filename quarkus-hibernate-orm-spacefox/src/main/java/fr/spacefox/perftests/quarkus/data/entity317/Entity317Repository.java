package fr.spacefox.perftests.quarkus.data.entity317;

import fr.spacefox.perftests.quarkus.core.port.data.Entity317DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service317.model.Model317;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity317Repository implements Entity317DatasourcePort, PanacheRepository<Entity317> {
    @Override
    public Optional<Model317> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
