package fr.spacefox.perftests.quarkus.data.entity254;

import fr.spacefox.perftests.quarkus.core.port.data.Entity254DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service254.model.Model254;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity254Repository implements Entity254DatasourcePort, PanacheRepository<Entity254> {
    @Override
    public Optional<Model254> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
