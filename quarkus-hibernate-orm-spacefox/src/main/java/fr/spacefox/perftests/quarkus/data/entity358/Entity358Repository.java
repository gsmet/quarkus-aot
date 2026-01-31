package fr.spacefox.perftests.quarkus.data.entity358;

import fr.spacefox.perftests.quarkus.core.port.data.Entity358DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service358.model.Model358;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity358Repository implements Entity358DatasourcePort, PanacheRepository<Entity358> {
    @Override
    public Optional<Model358> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
