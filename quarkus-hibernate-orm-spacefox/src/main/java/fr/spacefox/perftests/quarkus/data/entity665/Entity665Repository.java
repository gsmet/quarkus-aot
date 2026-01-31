package fr.spacefox.perftests.quarkus.data.entity665;

import fr.spacefox.perftests.quarkus.core.port.data.Entity665DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service665.model.Model665;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity665Repository implements Entity665DatasourcePort, PanacheRepository<Entity665> {
    @Override
    public Optional<Model665> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
