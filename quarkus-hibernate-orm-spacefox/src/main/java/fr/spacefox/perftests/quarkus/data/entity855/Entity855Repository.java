package fr.spacefox.perftests.quarkus.data.entity855;

import fr.spacefox.perftests.quarkus.core.port.data.Entity855DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service855.model.Model855;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity855Repository implements Entity855DatasourcePort, PanacheRepository<Entity855> {
    @Override
    public Optional<Model855> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
