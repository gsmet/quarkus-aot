package fr.spacefox.perftests.quarkus.data.entity931;

import fr.spacefox.perftests.quarkus.core.port.data.Entity931DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service931.model.Model931;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity931Repository implements Entity931DatasourcePort, PanacheRepository<Entity931> {
    @Override
    public Optional<Model931> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
