package fr.spacefox.perftests.quarkus.data.entity96;

import fr.spacefox.perftests.quarkus.core.port.data.Entity96DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service96.model.Model96;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity96Repository implements Entity96DatasourcePort, PanacheRepository<Entity96> {
    @Override
    public Optional<Model96> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
