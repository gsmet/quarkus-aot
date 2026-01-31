package fr.spacefox.perftests.quarkus.data.entity402;

import fr.spacefox.perftests.quarkus.core.port.data.Entity402DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service402.model.Model402;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity402Repository implements Entity402DatasourcePort, PanacheRepository<Entity402> {
    @Override
    public Optional<Model402> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
