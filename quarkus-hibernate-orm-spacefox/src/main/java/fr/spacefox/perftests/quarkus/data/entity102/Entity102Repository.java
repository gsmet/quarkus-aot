package fr.spacefox.perftests.quarkus.data.entity102;

import fr.spacefox.perftests.quarkus.core.port.data.Entity102DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service102.model.Model102;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity102Repository implements Entity102DatasourcePort, PanacheRepository<Entity102> {
    @Override
    public Optional<Model102> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
