package fr.spacefox.perftests.quarkus.data.entity84;

import fr.spacefox.perftests.quarkus.core.port.data.Entity84DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service84.model.Model84;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity84Repository implements Entity84DatasourcePort, PanacheRepository<Entity84> {
    @Override
    public Optional<Model84> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
