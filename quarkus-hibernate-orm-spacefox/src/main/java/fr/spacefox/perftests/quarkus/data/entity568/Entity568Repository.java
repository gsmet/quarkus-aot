package fr.spacefox.perftests.quarkus.data.entity568;

import fr.spacefox.perftests.quarkus.core.port.data.Entity568DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service568.model.Model568;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity568Repository implements Entity568DatasourcePort, PanacheRepository<Entity568> {
    @Override
    public Optional<Model568> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
