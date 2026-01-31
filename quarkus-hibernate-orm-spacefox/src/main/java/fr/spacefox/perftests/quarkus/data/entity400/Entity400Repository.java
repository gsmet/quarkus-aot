package fr.spacefox.perftests.quarkus.data.entity400;

import fr.spacefox.perftests.quarkus.core.port.data.Entity400DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service400.model.Model400;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity400Repository implements Entity400DatasourcePort, PanacheRepository<Entity400> {
    @Override
    public Optional<Model400> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
