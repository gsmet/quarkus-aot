package fr.spacefox.perftests.quarkus.data.entity970;

import fr.spacefox.perftests.quarkus.core.port.data.Entity970DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service970.model.Model970;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity970Repository implements Entity970DatasourcePort, PanacheRepository<Entity970> {
    @Override
    public Optional<Model970> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
