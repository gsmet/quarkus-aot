package fr.spacefox.perftests.quarkus.data.entity28;

import fr.spacefox.perftests.quarkus.core.port.data.Entity28DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service28.model.Model28;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity28Repository implements Entity28DatasourcePort, PanacheRepository<Entity28> {
    @Override
    public Optional<Model28> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
