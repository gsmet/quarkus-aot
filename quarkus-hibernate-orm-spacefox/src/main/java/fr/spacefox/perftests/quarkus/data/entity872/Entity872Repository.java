package fr.spacefox.perftests.quarkus.data.entity872;

import fr.spacefox.perftests.quarkus.core.port.data.Entity872DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service872.model.Model872;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity872Repository implements Entity872DatasourcePort, PanacheRepository<Entity872> {
    @Override
    public Optional<Model872> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
