package fr.spacefox.perftests.quarkus.data.entity963;

import fr.spacefox.perftests.quarkus.core.port.data.Entity963DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service963.model.Model963;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity963Repository implements Entity963DatasourcePort, PanacheRepository<Entity963> {
    @Override
    public Optional<Model963> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
