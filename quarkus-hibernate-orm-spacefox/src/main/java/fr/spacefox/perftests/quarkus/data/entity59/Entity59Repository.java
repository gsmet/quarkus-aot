package fr.spacefox.perftests.quarkus.data.entity59;

import fr.spacefox.perftests.quarkus.core.port.data.Entity59DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service59.model.Model59;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity59Repository implements Entity59DatasourcePort, PanacheRepository<Entity59> {
    @Override
    public Optional<Model59> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
