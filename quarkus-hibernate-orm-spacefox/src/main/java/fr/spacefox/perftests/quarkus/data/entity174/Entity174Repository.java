package fr.spacefox.perftests.quarkus.data.entity174;

import fr.spacefox.perftests.quarkus.core.port.data.Entity174DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service174.model.Model174;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity174Repository implements Entity174DatasourcePort, PanacheRepository<Entity174> {
    @Override
    public Optional<Model174> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
