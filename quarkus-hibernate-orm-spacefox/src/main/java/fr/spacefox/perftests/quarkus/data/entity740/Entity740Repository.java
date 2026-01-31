package fr.spacefox.perftests.quarkus.data.entity740;

import fr.spacefox.perftests.quarkus.core.port.data.Entity740DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service740.model.Model740;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity740Repository implements Entity740DatasourcePort, PanacheRepository<Entity740> {
    @Override
    public Optional<Model740> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
