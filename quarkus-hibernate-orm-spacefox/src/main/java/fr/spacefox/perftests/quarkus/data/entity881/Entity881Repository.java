package fr.spacefox.perftests.quarkus.data.entity881;

import fr.spacefox.perftests.quarkus.core.port.data.Entity881DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service881.model.Model881;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity881Repository implements Entity881DatasourcePort, PanacheRepository<Entity881> {
    @Override
    public Optional<Model881> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
