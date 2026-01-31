package fr.spacefox.perftests.quarkus.data.entity777;

import fr.spacefox.perftests.quarkus.core.port.data.Entity777DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service777.model.Model777;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity777Repository implements Entity777DatasourcePort, PanacheRepository<Entity777> {
    @Override
    public Optional<Model777> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
