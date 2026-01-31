package fr.spacefox.perftests.quarkus.data.entity380;

import fr.spacefox.perftests.quarkus.core.port.data.Entity380DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service380.model.Model380;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity380Repository implements Entity380DatasourcePort, PanacheRepository<Entity380> {
    @Override
    public Optional<Model380> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
