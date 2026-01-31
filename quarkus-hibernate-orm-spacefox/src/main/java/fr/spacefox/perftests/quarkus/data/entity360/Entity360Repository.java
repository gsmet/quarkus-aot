package fr.spacefox.perftests.quarkus.data.entity360;

import fr.spacefox.perftests.quarkus.core.port.data.Entity360DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service360.model.Model360;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity360Repository implements Entity360DatasourcePort, PanacheRepository<Entity360> {
    @Override
    public Optional<Model360> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
