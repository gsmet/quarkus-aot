package fr.spacefox.perftests.quarkus.data.entity929;

import fr.spacefox.perftests.quarkus.core.port.data.Entity929DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service929.model.Model929;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity929Repository implements Entity929DatasourcePort, PanacheRepository<Entity929> {
    @Override
    public Optional<Model929> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
