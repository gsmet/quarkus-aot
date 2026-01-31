package fr.spacefox.perftests.quarkus.data.entity533;

import fr.spacefox.perftests.quarkus.core.port.data.Entity533DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service533.model.Model533;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity533Repository implements Entity533DatasourcePort, PanacheRepository<Entity533> {
    @Override
    public Optional<Model533> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
