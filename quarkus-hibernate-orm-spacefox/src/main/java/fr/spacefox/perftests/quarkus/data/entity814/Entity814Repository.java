package fr.spacefox.perftests.quarkus.data.entity814;

import fr.spacefox.perftests.quarkus.core.port.data.Entity814DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service814.model.Model814;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity814Repository implements Entity814DatasourcePort, PanacheRepository<Entity814> {
    @Override
    public Optional<Model814> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
