package fr.spacefox.perftests.quarkus.data.entity969;

import fr.spacefox.perftests.quarkus.core.port.data.Entity969DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service969.model.Model969;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity969Repository implements Entity969DatasourcePort, PanacheRepository<Entity969> {
    @Override
    public Optional<Model969> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
