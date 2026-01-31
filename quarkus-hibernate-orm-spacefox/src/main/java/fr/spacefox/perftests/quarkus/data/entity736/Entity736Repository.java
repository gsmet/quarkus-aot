package fr.spacefox.perftests.quarkus.data.entity736;

import fr.spacefox.perftests.quarkus.core.port.data.Entity736DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service736.model.Model736;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity736Repository implements Entity736DatasourcePort, PanacheRepository<Entity736> {
    @Override
    public Optional<Model736> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
