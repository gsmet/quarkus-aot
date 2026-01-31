package fr.spacefox.perftests.quarkus.data.entity962;

import fr.spacefox.perftests.quarkus.core.port.data.Entity962DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service962.model.Model962;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity962Repository implements Entity962DatasourcePort, PanacheRepository<Entity962> {
    @Override
    public Optional<Model962> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
