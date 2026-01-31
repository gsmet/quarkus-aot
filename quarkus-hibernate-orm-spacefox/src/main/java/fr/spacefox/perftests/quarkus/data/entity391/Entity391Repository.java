package fr.spacefox.perftests.quarkus.data.entity391;

import fr.spacefox.perftests.quarkus.core.port.data.Entity391DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service391.model.Model391;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity391Repository implements Entity391DatasourcePort, PanacheRepository<Entity391> {
    @Override
    public Optional<Model391> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
