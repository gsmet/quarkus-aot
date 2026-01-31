package fr.spacefox.perftests.quarkus.data.entity381;

import fr.spacefox.perftests.quarkus.core.port.data.Entity381DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service381.model.Model381;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity381Repository implements Entity381DatasourcePort, PanacheRepository<Entity381> {
    @Override
    public Optional<Model381> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
