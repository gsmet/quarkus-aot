package fr.spacefox.perftests.quarkus.data.entity75;

import fr.spacefox.perftests.quarkus.core.port.data.Entity75DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service75.model.Model75;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity75Repository implements Entity75DatasourcePort, PanacheRepository<Entity75> {
    @Override
    public Optional<Model75> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
