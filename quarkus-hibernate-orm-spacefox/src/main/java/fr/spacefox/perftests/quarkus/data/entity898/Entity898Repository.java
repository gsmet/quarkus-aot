package fr.spacefox.perftests.quarkus.data.entity898;

import fr.spacefox.perftests.quarkus.core.port.data.Entity898DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service898.model.Model898;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity898Repository implements Entity898DatasourcePort, PanacheRepository<Entity898> {
    @Override
    public Optional<Model898> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
