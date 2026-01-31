package fr.spacefox.perftests.quarkus.data.entity363;

import fr.spacefox.perftests.quarkus.core.port.data.Entity363DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service363.model.Model363;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity363Repository implements Entity363DatasourcePort, PanacheRepository<Entity363> {
    @Override
    public Optional<Model363> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
