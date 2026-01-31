package fr.spacefox.perftests.quarkus.data.entity146;

import fr.spacefox.perftests.quarkus.core.port.data.Entity146DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service146.model.Model146;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity146Repository implements Entity146DatasourcePort, PanacheRepository<Entity146> {
    @Override
    public Optional<Model146> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
