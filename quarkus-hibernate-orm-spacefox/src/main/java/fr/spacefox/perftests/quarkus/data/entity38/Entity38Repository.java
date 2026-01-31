package fr.spacefox.perftests.quarkus.data.entity38;

import fr.spacefox.perftests.quarkus.core.port.data.Entity38DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service38.model.Model38;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity38Repository implements Entity38DatasourcePort, PanacheRepository<Entity38> {
    @Override
    public Optional<Model38> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
