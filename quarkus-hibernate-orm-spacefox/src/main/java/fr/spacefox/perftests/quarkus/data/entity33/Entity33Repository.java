package fr.spacefox.perftests.quarkus.data.entity33;

import fr.spacefox.perftests.quarkus.core.port.data.Entity33DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service33.model.Model33;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity33Repository implements Entity33DatasourcePort, PanacheRepository<Entity33> {
    @Override
    public Optional<Model33> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
