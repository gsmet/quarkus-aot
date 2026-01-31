package fr.spacefox.perftests.quarkus.data.entity502;

import fr.spacefox.perftests.quarkus.core.port.data.Entity502DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service502.model.Model502;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity502Repository implements Entity502DatasourcePort, PanacheRepository<Entity502> {
    @Override
    public Optional<Model502> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
