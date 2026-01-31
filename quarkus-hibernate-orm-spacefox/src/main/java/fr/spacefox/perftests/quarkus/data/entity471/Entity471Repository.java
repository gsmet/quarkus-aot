package fr.spacefox.perftests.quarkus.data.entity471;

import fr.spacefox.perftests.quarkus.core.port.data.Entity471DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service471.model.Model471;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity471Repository implements Entity471DatasourcePort, PanacheRepository<Entity471> {
    @Override
    public Optional<Model471> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
