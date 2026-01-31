package fr.spacefox.perftests.quarkus.data.entity668;

import fr.spacefox.perftests.quarkus.core.port.data.Entity668DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service668.model.Model668;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity668Repository implements Entity668DatasourcePort, PanacheRepository<Entity668> {
    @Override
    public Optional<Model668> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
