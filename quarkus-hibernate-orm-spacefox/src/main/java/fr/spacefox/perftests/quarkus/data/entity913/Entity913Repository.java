package fr.spacefox.perftests.quarkus.data.entity913;

import fr.spacefox.perftests.quarkus.core.port.data.Entity913DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service913.model.Model913;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity913Repository implements Entity913DatasourcePort, PanacheRepository<Entity913> {
    @Override
    public Optional<Model913> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
