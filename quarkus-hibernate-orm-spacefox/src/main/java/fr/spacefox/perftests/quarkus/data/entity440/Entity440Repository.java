package fr.spacefox.perftests.quarkus.data.entity440;

import fr.spacefox.perftests.quarkus.core.port.data.Entity440DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service440.model.Model440;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity440Repository implements Entity440DatasourcePort, PanacheRepository<Entity440> {
    @Override
    public Optional<Model440> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
