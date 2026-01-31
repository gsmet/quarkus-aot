package fr.spacefox.perftests.quarkus.data.entity262;

import fr.spacefox.perftests.quarkus.core.port.data.Entity262DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service262.model.Model262;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity262Repository implements Entity262DatasourcePort, PanacheRepository<Entity262> {
    @Override
    public Optional<Model262> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
