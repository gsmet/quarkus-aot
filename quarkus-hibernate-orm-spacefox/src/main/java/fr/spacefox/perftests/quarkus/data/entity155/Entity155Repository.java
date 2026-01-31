package fr.spacefox.perftests.quarkus.data.entity155;

import fr.spacefox.perftests.quarkus.core.port.data.Entity155DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service155.model.Model155;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity155Repository implements Entity155DatasourcePort, PanacheRepository<Entity155> {
    @Override
    public Optional<Model155> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
