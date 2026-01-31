package fr.spacefox.perftests.quarkus.data.entity571;

import fr.spacefox.perftests.quarkus.core.port.data.Entity571DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service571.model.Model571;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity571Repository implements Entity571DatasourcePort, PanacheRepository<Entity571> {
    @Override
    public Optional<Model571> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
