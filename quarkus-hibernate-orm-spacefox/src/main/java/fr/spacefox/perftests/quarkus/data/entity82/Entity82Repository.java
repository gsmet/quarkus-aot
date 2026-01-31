package fr.spacefox.perftests.quarkus.data.entity82;

import fr.spacefox.perftests.quarkus.core.port.data.Entity82DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service82.model.Model82;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity82Repository implements Entity82DatasourcePort, PanacheRepository<Entity82> {
    @Override
    public Optional<Model82> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
