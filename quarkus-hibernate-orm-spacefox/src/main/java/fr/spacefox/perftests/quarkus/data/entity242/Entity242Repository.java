package fr.spacefox.perftests.quarkus.data.entity242;

import fr.spacefox.perftests.quarkus.core.port.data.Entity242DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service242.model.Model242;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity242Repository implements Entity242DatasourcePort, PanacheRepository<Entity242> {
    @Override
    public Optional<Model242> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
