package fr.spacefox.perftests.quarkus.data.entity621;

import fr.spacefox.perftests.quarkus.core.port.data.Entity621DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service621.model.Model621;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity621Repository implements Entity621DatasourcePort, PanacheRepository<Entity621> {
    @Override
    public Optional<Model621> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
