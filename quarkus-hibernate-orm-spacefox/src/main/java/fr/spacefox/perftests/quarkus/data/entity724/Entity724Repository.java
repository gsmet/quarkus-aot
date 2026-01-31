package fr.spacefox.perftests.quarkus.data.entity724;

import fr.spacefox.perftests.quarkus.core.port.data.Entity724DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service724.model.Model724;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity724Repository implements Entity724DatasourcePort, PanacheRepository<Entity724> {
    @Override
    public Optional<Model724> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
