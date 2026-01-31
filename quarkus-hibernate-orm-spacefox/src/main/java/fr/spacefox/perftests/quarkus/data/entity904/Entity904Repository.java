package fr.spacefox.perftests.quarkus.data.entity904;

import fr.spacefox.perftests.quarkus.core.port.data.Entity904DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service904.model.Model904;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity904Repository implements Entity904DatasourcePort, PanacheRepository<Entity904> {
    @Override
    public Optional<Model904> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
