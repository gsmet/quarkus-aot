package fr.spacefox.perftests.quarkus.data.entity732;

import fr.spacefox.perftests.quarkus.core.port.data.Entity732DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service732.model.Model732;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity732Repository implements Entity732DatasourcePort, PanacheRepository<Entity732> {
    @Override
    public Optional<Model732> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
