package fr.spacefox.perftests.quarkus.data.entity334;

import fr.spacefox.perftests.quarkus.core.port.data.Entity334DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service334.model.Model334;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity334Repository implements Entity334DatasourcePort, PanacheRepository<Entity334> {
    @Override
    public Optional<Model334> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
