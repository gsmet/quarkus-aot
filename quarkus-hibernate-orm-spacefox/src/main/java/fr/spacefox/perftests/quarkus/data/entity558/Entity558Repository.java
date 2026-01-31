package fr.spacefox.perftests.quarkus.data.entity558;

import fr.spacefox.perftests.quarkus.core.port.data.Entity558DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service558.model.Model558;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity558Repository implements Entity558DatasourcePort, PanacheRepository<Entity558> {
    @Override
    public Optional<Model558> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
