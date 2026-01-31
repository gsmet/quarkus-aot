package fr.spacefox.perftests.quarkus.data.entity730;

import fr.spacefox.perftests.quarkus.core.port.data.Entity730DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service730.model.Model730;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity730Repository implements Entity730DatasourcePort, PanacheRepository<Entity730> {
    @Override
    public Optional<Model730> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
