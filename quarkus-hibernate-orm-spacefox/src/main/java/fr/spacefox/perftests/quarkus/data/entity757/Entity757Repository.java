package fr.spacefox.perftests.quarkus.data.entity757;

import fr.spacefox.perftests.quarkus.core.port.data.Entity757DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service757.model.Model757;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity757Repository implements Entity757DatasourcePort, PanacheRepository<Entity757> {
    @Override
    public Optional<Model757> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
