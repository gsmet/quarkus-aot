package fr.spacefox.perftests.quarkus.data.entity376;

import fr.spacefox.perftests.quarkus.core.port.data.Entity376DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service376.model.Model376;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity376Repository implements Entity376DatasourcePort, PanacheRepository<Entity376> {
    @Override
    public Optional<Model376> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
