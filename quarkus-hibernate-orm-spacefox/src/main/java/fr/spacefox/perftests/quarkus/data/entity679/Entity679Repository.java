package fr.spacefox.perftests.quarkus.data.entity679;

import fr.spacefox.perftests.quarkus.core.port.data.Entity679DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service679.model.Model679;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity679Repository implements Entity679DatasourcePort, PanacheRepository<Entity679> {
    @Override
    public Optional<Model679> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
