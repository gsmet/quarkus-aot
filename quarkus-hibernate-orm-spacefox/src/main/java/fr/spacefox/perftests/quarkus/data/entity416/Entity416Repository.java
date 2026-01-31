package fr.spacefox.perftests.quarkus.data.entity416;

import fr.spacefox.perftests.quarkus.core.port.data.Entity416DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service416.model.Model416;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity416Repository implements Entity416DatasourcePort, PanacheRepository<Entity416> {
    @Override
    public Optional<Model416> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
