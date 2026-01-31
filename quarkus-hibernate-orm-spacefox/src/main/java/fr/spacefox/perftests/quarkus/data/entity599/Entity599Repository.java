package fr.spacefox.perftests.quarkus.data.entity599;

import fr.spacefox.perftests.quarkus.core.port.data.Entity599DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service599.model.Model599;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity599Repository implements Entity599DatasourcePort, PanacheRepository<Entity599> {
    @Override
    public Optional<Model599> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
