package fr.spacefox.perftests.quarkus.data.entity526;

import fr.spacefox.perftests.quarkus.core.port.data.Entity526DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service526.model.Model526;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity526Repository implements Entity526DatasourcePort, PanacheRepository<Entity526> {
    @Override
    public Optional<Model526> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
