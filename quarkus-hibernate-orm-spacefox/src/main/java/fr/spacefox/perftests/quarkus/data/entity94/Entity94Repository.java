package fr.spacefox.perftests.quarkus.data.entity94;

import fr.spacefox.perftests.quarkus.core.port.data.Entity94DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service94.model.Model94;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity94Repository implements Entity94DatasourcePort, PanacheRepository<Entity94> {
    @Override
    public Optional<Model94> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
