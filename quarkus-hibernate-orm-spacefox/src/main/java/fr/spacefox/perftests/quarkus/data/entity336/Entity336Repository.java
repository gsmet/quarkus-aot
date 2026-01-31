package fr.spacefox.perftests.quarkus.data.entity336;

import fr.spacefox.perftests.quarkus.core.port.data.Entity336DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service336.model.Model336;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity336Repository implements Entity336DatasourcePort, PanacheRepository<Entity336> {
    @Override
    public Optional<Model336> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
