package fr.spacefox.perftests.quarkus.data.entity912;

import fr.spacefox.perftests.quarkus.core.port.data.Entity912DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service912.model.Model912;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity912Repository implements Entity912DatasourcePort, PanacheRepository<Entity912> {
    @Override
    public Optional<Model912> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
