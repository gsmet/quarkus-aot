package fr.spacefox.perftests.quarkus.data.entity829;

import fr.spacefox.perftests.quarkus.core.port.data.Entity829DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service829.model.Model829;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity829Repository implements Entity829DatasourcePort, PanacheRepository<Entity829> {
    @Override
    public Optional<Model829> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
