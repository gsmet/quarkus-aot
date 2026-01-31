package fr.spacefox.perftests.quarkus.data.entity207;

import fr.spacefox.perftests.quarkus.core.port.data.Entity207DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service207.model.Model207;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity207Repository implements Entity207DatasourcePort, PanacheRepository<Entity207> {
    @Override
    public Optional<Model207> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
