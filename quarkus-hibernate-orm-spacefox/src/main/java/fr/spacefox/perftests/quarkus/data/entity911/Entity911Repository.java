package fr.spacefox.perftests.quarkus.data.entity911;

import fr.spacefox.perftests.quarkus.core.port.data.Entity911DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service911.model.Model911;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity911Repository implements Entity911DatasourcePort, PanacheRepository<Entity911> {
    @Override
    public Optional<Model911> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
