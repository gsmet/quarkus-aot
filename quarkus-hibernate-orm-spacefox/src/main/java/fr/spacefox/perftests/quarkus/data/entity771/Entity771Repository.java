package fr.spacefox.perftests.quarkus.data.entity771;

import fr.spacefox.perftests.quarkus.core.port.data.Entity771DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service771.model.Model771;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity771Repository implements Entity771DatasourcePort, PanacheRepository<Entity771> {
    @Override
    public Optional<Model771> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
