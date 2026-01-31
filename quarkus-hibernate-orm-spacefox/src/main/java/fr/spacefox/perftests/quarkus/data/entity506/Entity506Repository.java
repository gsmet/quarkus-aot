package fr.spacefox.perftests.quarkus.data.entity506;

import fr.spacefox.perftests.quarkus.core.port.data.Entity506DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service506.model.Model506;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity506Repository implements Entity506DatasourcePort, PanacheRepository<Entity506> {
    @Override
    public Optional<Model506> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
