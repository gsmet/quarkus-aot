package fr.spacefox.perftests.quarkus.data.entity552;

import fr.spacefox.perftests.quarkus.core.port.data.Entity552DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service552.model.Model552;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity552Repository implements Entity552DatasourcePort, PanacheRepository<Entity552> {
    @Override
    public Optional<Model552> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
