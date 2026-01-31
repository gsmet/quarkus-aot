package fr.spacefox.perftests.quarkus.data.entity895;

import fr.spacefox.perftests.quarkus.core.port.data.Entity895DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service895.model.Model895;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity895Repository implements Entity895DatasourcePort, PanacheRepository<Entity895> {
    @Override
    public Optional<Model895> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
