package fr.spacefox.perftests.quarkus.data.entity797;

import fr.spacefox.perftests.quarkus.core.port.data.Entity797DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service797.model.Model797;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity797Repository implements Entity797DatasourcePort, PanacheRepository<Entity797> {
    @Override
    public Optional<Model797> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
