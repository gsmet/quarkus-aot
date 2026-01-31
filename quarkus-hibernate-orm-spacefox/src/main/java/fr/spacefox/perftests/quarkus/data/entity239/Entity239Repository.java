package fr.spacefox.perftests.quarkus.data.entity239;

import fr.spacefox.perftests.quarkus.core.port.data.Entity239DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service239.model.Model239;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity239Repository implements Entity239DatasourcePort, PanacheRepository<Entity239> {
    @Override
    public Optional<Model239> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
