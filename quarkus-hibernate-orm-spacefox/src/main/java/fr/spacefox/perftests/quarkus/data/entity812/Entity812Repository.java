package fr.spacefox.perftests.quarkus.data.entity812;

import fr.spacefox.perftests.quarkus.core.port.data.Entity812DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service812.model.Model812;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity812Repository implements Entity812DatasourcePort, PanacheRepository<Entity812> {
    @Override
    public Optional<Model812> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
