package fr.spacefox.perftests.quarkus.data.entity235;

import fr.spacefox.perftests.quarkus.core.port.data.Entity235DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service235.model.Model235;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity235Repository implements Entity235DatasourcePort, PanacheRepository<Entity235> {
    @Override
    public Optional<Model235> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
