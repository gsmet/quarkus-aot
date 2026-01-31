package fr.spacefox.perftests.quarkus.data.entity29;

import fr.spacefox.perftests.quarkus.core.port.data.Entity29DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service29.model.Model29;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity29Repository implements Entity29DatasourcePort, PanacheRepository<Entity29> {
    @Override
    public Optional<Model29> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
