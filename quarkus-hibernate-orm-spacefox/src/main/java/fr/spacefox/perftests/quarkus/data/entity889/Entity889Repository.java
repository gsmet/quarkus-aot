package fr.spacefox.perftests.quarkus.data.entity889;

import fr.spacefox.perftests.quarkus.core.port.data.Entity889DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service889.model.Model889;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity889Repository implements Entity889DatasourcePort, PanacheRepository<Entity889> {
    @Override
    public Optional<Model889> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
