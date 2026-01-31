package fr.spacefox.perftests.quarkus.data.entity231;

import fr.spacefox.perftests.quarkus.core.port.data.Entity231DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service231.model.Model231;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity231Repository implements Entity231DatasourcePort, PanacheRepository<Entity231> {
    @Override
    public Optional<Model231> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
