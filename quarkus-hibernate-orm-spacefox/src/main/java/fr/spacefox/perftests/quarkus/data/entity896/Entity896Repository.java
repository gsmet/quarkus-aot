package fr.spacefox.perftests.quarkus.data.entity896;

import fr.spacefox.perftests.quarkus.core.port.data.Entity896DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service896.model.Model896;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity896Repository implements Entity896DatasourcePort, PanacheRepository<Entity896> {
    @Override
    public Optional<Model896> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
