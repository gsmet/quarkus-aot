package fr.spacefox.perftests.quarkus.data.entity81;

import fr.spacefox.perftests.quarkus.core.port.data.Entity81DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service81.model.Model81;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity81Repository implements Entity81DatasourcePort, PanacheRepository<Entity81> {
    @Override
    public Optional<Model81> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
