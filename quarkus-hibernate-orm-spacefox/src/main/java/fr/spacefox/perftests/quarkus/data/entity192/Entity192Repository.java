package fr.spacefox.perftests.quarkus.data.entity192;

import fr.spacefox.perftests.quarkus.core.port.data.Entity192DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service192.model.Model192;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity192Repository implements Entity192DatasourcePort, PanacheRepository<Entity192> {
    @Override
    public Optional<Model192> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
