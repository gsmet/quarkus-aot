package fr.spacefox.perftests.quarkus.data.entity309;

import fr.spacefox.perftests.quarkus.core.port.data.Entity309DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service309.model.Model309;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity309Repository implements Entity309DatasourcePort, PanacheRepository<Entity309> {
    @Override
    public Optional<Model309> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
