package fr.spacefox.perftests.quarkus.data.entity51;

import fr.spacefox.perftests.quarkus.core.port.data.Entity51DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service51.model.Model51;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity51Repository implements Entity51DatasourcePort, PanacheRepository<Entity51> {
    @Override
    public Optional<Model51> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
