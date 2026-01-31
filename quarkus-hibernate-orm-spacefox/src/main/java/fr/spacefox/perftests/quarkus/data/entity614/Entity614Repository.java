package fr.spacefox.perftests.quarkus.data.entity614;

import fr.spacefox.perftests.quarkus.core.port.data.Entity614DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service614.model.Model614;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity614Repository implements Entity614DatasourcePort, PanacheRepository<Entity614> {
    @Override
    public Optional<Model614> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
