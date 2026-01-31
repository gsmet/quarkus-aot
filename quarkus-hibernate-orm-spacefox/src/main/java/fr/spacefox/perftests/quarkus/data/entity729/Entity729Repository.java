package fr.spacefox.perftests.quarkus.data.entity729;

import fr.spacefox.perftests.quarkus.core.port.data.Entity729DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service729.model.Model729;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity729Repository implements Entity729DatasourcePort, PanacheRepository<Entity729> {
    @Override
    public Optional<Model729> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
