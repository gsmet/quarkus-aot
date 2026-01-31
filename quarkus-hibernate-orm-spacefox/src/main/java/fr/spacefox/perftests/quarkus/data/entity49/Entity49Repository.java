package fr.spacefox.perftests.quarkus.data.entity49;

import fr.spacefox.perftests.quarkus.core.port.data.Entity49DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service49.model.Model49;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity49Repository implements Entity49DatasourcePort, PanacheRepository<Entity49> {
    @Override
    public Optional<Model49> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
