package fr.spacefox.perftests.quarkus.data.entity422;

import fr.spacefox.perftests.quarkus.core.port.data.Entity422DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service422.model.Model422;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity422Repository implements Entity422DatasourcePort, PanacheRepository<Entity422> {
    @Override
    public Optional<Model422> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
