package fr.spacefox.perftests.quarkus.data.entity395;

import fr.spacefox.perftests.quarkus.core.port.data.Entity395DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service395.model.Model395;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity395Repository implements Entity395DatasourcePort, PanacheRepository<Entity395> {
    @Override
    public Optional<Model395> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
