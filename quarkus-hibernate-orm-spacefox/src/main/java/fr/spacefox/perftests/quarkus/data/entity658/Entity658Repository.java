package fr.spacefox.perftests.quarkus.data.entity658;

import fr.spacefox.perftests.quarkus.core.port.data.Entity658DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service658.model.Model658;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity658Repository implements Entity658DatasourcePort, PanacheRepository<Entity658> {
    @Override
    public Optional<Model658> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
