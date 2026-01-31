package fr.spacefox.perftests.quarkus.data.entity30;

import fr.spacefox.perftests.quarkus.core.port.data.Entity30DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service30.model.Model30;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity30Repository implements Entity30DatasourcePort, PanacheRepository<Entity30> {
    @Override
    public Optional<Model30> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
