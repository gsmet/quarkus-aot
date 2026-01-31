package fr.spacefox.perftests.quarkus.data.entity525;

import fr.spacefox.perftests.quarkus.core.port.data.Entity525DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service525.model.Model525;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity525Repository implements Entity525DatasourcePort, PanacheRepository<Entity525> {
    @Override
    public Optional<Model525> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
