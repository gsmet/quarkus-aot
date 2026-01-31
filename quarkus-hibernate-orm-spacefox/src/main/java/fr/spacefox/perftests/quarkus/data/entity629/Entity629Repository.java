package fr.spacefox.perftests.quarkus.data.entity629;

import fr.spacefox.perftests.quarkus.core.port.data.Entity629DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service629.model.Model629;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity629Repository implements Entity629DatasourcePort, PanacheRepository<Entity629> {
    @Override
    public Optional<Model629> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
