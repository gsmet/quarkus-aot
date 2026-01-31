package fr.spacefox.perftests.quarkus.data.entity145;

import fr.spacefox.perftests.quarkus.core.port.data.Entity145DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service145.model.Model145;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity145Repository implements Entity145DatasourcePort, PanacheRepository<Entity145> {
    @Override
    public Optional<Model145> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
