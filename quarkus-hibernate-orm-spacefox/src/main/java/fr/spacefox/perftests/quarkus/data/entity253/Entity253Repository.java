package fr.spacefox.perftests.quarkus.data.entity253;

import fr.spacefox.perftests.quarkus.core.port.data.Entity253DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service253.model.Model253;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity253Repository implements Entity253DatasourcePort, PanacheRepository<Entity253> {
    @Override
    public Optional<Model253> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
