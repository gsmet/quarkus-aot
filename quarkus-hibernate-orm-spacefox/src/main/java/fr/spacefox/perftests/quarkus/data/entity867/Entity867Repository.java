package fr.spacefox.perftests.quarkus.data.entity867;

import fr.spacefox.perftests.quarkus.core.port.data.Entity867DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service867.model.Model867;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity867Repository implements Entity867DatasourcePort, PanacheRepository<Entity867> {
    @Override
    public Optional<Model867> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
