package fr.spacefox.perftests.quarkus.data.entity274;

import fr.spacefox.perftests.quarkus.core.port.data.Entity274DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service274.model.Model274;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity274Repository implements Entity274DatasourcePort, PanacheRepository<Entity274> {
    @Override
    public Optional<Model274> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
