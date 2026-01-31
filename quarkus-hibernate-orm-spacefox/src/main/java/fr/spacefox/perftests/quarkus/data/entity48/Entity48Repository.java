package fr.spacefox.perftests.quarkus.data.entity48;

import fr.spacefox.perftests.quarkus.core.port.data.Entity48DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service48.model.Model48;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity48Repository implements Entity48DatasourcePort, PanacheRepository<Entity48> {
    @Override
    public Optional<Model48> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
