package fr.spacefox.perftests.quarkus.data.entity385;

import fr.spacefox.perftests.quarkus.core.port.data.Entity385DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service385.model.Model385;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity385Repository implements Entity385DatasourcePort, PanacheRepository<Entity385> {
    @Override
    public Optional<Model385> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
