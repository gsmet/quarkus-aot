package fr.spacefox.perftests.quarkus.data.entity894;

import fr.spacefox.perftests.quarkus.core.port.data.Entity894DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service894.model.Model894;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity894Repository implements Entity894DatasourcePort, PanacheRepository<Entity894> {
    @Override
    public Optional<Model894> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
