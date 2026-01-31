package fr.spacefox.perftests.quarkus.data.entity63;

import fr.spacefox.perftests.quarkus.core.port.data.Entity63DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service63.model.Model63;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity63Repository implements Entity63DatasourcePort, PanacheRepository<Entity63> {
    @Override
    public Optional<Model63> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
