package fr.spacefox.perftests.quarkus.data.entity163;

import fr.spacefox.perftests.quarkus.core.port.data.Entity163DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service163.model.Model163;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity163Repository implements Entity163DatasourcePort, PanacheRepository<Entity163> {
    @Override
    public Optional<Model163> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
