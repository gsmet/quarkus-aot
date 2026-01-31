package fr.spacefox.perftests.quarkus.data.entity772;

import fr.spacefox.perftests.quarkus.core.port.data.Entity772DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service772.model.Model772;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity772Repository implements Entity772DatasourcePort, PanacheRepository<Entity772> {
    @Override
    public Optional<Model772> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
