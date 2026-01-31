package fr.spacefox.perftests.quarkus.data.entity619;

import fr.spacefox.perftests.quarkus.core.port.data.Entity619DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service619.model.Model619;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity619Repository implements Entity619DatasourcePort, PanacheRepository<Entity619> {
    @Override
    public Optional<Model619> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
