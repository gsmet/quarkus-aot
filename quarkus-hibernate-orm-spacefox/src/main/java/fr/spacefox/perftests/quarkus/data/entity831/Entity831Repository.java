package fr.spacefox.perftests.quarkus.data.entity831;

import fr.spacefox.perftests.quarkus.core.port.data.Entity831DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service831.model.Model831;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity831Repository implements Entity831DatasourcePort, PanacheRepository<Entity831> {
    @Override
    public Optional<Model831> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
