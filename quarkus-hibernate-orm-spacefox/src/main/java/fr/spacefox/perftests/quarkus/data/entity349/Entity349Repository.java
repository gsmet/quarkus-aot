package fr.spacefox.perftests.quarkus.data.entity349;

import fr.spacefox.perftests.quarkus.core.port.data.Entity349DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service349.model.Model349;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity349Repository implements Entity349DatasourcePort, PanacheRepository<Entity349> {
    @Override
    public Optional<Model349> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
