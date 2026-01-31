package fr.spacefox.perftests.quarkus.data.entity462;

import fr.spacefox.perftests.quarkus.core.port.data.Entity462DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service462.model.Model462;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity462Repository implements Entity462DatasourcePort, PanacheRepository<Entity462> {
    @Override
    public Optional<Model462> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
