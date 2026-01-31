package fr.spacefox.perftests.quarkus.data.entity469;

import fr.spacefox.perftests.quarkus.core.port.data.Entity469DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service469.model.Model469;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity469Repository implements Entity469DatasourcePort, PanacheRepository<Entity469> {
    @Override
    public Optional<Model469> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
