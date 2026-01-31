package fr.spacefox.perftests.quarkus.data.entity382;

import fr.spacefox.perftests.quarkus.core.port.data.Entity382DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service382.model.Model382;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity382Repository implements Entity382DatasourcePort, PanacheRepository<Entity382> {
    @Override
    public Optional<Model382> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
