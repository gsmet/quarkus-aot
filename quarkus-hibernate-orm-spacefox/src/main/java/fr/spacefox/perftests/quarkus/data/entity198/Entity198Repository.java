package fr.spacefox.perftests.quarkus.data.entity198;

import fr.spacefox.perftests.quarkus.core.port.data.Entity198DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service198.model.Model198;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity198Repository implements Entity198DatasourcePort, PanacheRepository<Entity198> {
    @Override
    public Optional<Model198> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
