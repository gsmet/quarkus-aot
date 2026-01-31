package fr.spacefox.perftests.quarkus.data.entity669;

import fr.spacefox.perftests.quarkus.core.port.data.Entity669DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service669.model.Model669;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity669Repository implements Entity669DatasourcePort, PanacheRepository<Entity669> {
    @Override
    public Optional<Model669> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
