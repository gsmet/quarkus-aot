package fr.spacefox.perftests.quarkus.data.entity950;

import fr.spacefox.perftests.quarkus.core.port.data.Entity950DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service950.model.Model950;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity950Repository implements Entity950DatasourcePort, PanacheRepository<Entity950> {
    @Override
    public Optional<Model950> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
