package fr.spacefox.perftests.quarkus.data.entity709;

import fr.spacefox.perftests.quarkus.core.port.data.Entity709DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service709.model.Model709;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity709Repository implements Entity709DatasourcePort, PanacheRepository<Entity709> {
    @Override
    public Optional<Model709> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
