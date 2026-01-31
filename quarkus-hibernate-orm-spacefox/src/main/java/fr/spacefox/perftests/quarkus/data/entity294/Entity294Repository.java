package fr.spacefox.perftests.quarkus.data.entity294;

import fr.spacefox.perftests.quarkus.core.port.data.Entity294DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service294.model.Model294;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity294Repository implements Entity294DatasourcePort, PanacheRepository<Entity294> {
    @Override
    public Optional<Model294> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
