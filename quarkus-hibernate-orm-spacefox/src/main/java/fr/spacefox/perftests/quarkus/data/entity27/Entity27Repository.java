package fr.spacefox.perftests.quarkus.data.entity27;

import fr.spacefox.perftests.quarkus.core.port.data.Entity27DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service27.model.Model27;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity27Repository implements Entity27DatasourcePort, PanacheRepository<Entity27> {
    @Override
    public Optional<Model27> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
