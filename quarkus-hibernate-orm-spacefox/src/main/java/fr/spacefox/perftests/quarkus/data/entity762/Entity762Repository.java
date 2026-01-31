package fr.spacefox.perftests.quarkus.data.entity762;

import fr.spacefox.perftests.quarkus.core.port.data.Entity762DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service762.model.Model762;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity762Repository implements Entity762DatasourcePort, PanacheRepository<Entity762> {
    @Override
    public Optional<Model762> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
