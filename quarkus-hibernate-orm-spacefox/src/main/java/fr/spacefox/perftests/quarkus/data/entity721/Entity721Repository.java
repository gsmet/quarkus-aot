package fr.spacefox.perftests.quarkus.data.entity721;

import fr.spacefox.perftests.quarkus.core.port.data.Entity721DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service721.model.Model721;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity721Repository implements Entity721DatasourcePort, PanacheRepository<Entity721> {
    @Override
    public Optional<Model721> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
