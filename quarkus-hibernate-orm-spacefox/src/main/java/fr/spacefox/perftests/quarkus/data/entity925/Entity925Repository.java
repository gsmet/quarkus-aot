package fr.spacefox.perftests.quarkus.data.entity925;

import fr.spacefox.perftests.quarkus.core.port.data.Entity925DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service925.model.Model925;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity925Repository implements Entity925DatasourcePort, PanacheRepository<Entity925> {
    @Override
    public Optional<Model925> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
