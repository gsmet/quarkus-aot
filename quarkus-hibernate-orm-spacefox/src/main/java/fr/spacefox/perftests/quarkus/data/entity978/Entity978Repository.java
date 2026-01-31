package fr.spacefox.perftests.quarkus.data.entity978;

import fr.spacefox.perftests.quarkus.core.port.data.Entity978DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service978.model.Model978;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity978Repository implements Entity978DatasourcePort, PanacheRepository<Entity978> {
    @Override
    public Optional<Model978> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
