package fr.spacefox.perftests.quarkus.data.entity820;

import fr.spacefox.perftests.quarkus.core.port.data.Entity820DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service820.model.Model820;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity820Repository implements Entity820DatasourcePort, PanacheRepository<Entity820> {
    @Override
    public Optional<Model820> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
