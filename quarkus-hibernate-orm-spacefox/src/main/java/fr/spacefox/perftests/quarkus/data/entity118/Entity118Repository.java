package fr.spacefox.perftests.quarkus.data.entity118;

import fr.spacefox.perftests.quarkus.core.port.data.Entity118DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service118.model.Model118;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity118Repository implements Entity118DatasourcePort, PanacheRepository<Entity118> {
    @Override
    public Optional<Model118> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
