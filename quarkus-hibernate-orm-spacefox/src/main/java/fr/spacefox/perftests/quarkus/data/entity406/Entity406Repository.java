package fr.spacefox.perftests.quarkus.data.entity406;

import fr.spacefox.perftests.quarkus.core.port.data.Entity406DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service406.model.Model406;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity406Repository implements Entity406DatasourcePort, PanacheRepository<Entity406> {
    @Override
    public Optional<Model406> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
