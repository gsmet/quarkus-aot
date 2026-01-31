package fr.spacefox.perftests.quarkus.data.entity247;

import fr.spacefox.perftests.quarkus.core.port.data.Entity247DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service247.model.Model247;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity247Repository implements Entity247DatasourcePort, PanacheRepository<Entity247> {
    @Override
    public Optional<Model247> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
