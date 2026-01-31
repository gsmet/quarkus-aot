package fr.spacefox.perftests.quarkus.data.entity489;

import fr.spacefox.perftests.quarkus.core.port.data.Entity489DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service489.model.Model489;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity489Repository implements Entity489DatasourcePort, PanacheRepository<Entity489> {
    @Override
    public Optional<Model489> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
