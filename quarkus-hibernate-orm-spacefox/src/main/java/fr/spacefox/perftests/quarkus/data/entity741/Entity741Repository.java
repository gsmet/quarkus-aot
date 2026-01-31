package fr.spacefox.perftests.quarkus.data.entity741;

import fr.spacefox.perftests.quarkus.core.port.data.Entity741DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service741.model.Model741;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity741Repository implements Entity741DatasourcePort, PanacheRepository<Entity741> {
    @Override
    public Optional<Model741> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
