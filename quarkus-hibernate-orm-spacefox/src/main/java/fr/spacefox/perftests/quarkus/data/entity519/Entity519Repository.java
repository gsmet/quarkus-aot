package fr.spacefox.perftests.quarkus.data.entity519;

import fr.spacefox.perftests.quarkus.core.port.data.Entity519DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service519.model.Model519;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity519Repository implements Entity519DatasourcePort, PanacheRepository<Entity519> {
    @Override
    public Optional<Model519> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
