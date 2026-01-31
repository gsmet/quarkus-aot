package fr.spacefox.perftests.quarkus.data.entity807;

import fr.spacefox.perftests.quarkus.core.port.data.Entity807DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service807.model.Model807;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity807Repository implements Entity807DatasourcePort, PanacheRepository<Entity807> {
    @Override
    public Optional<Model807> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
