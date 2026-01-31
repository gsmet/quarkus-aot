package fr.spacefox.perftests.quarkus.data.entity553;

import fr.spacefox.perftests.quarkus.core.port.data.Entity553DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service553.model.Model553;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity553Repository implements Entity553DatasourcePort, PanacheRepository<Entity553> {
    @Override
    public Optional<Model553> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
