package fr.spacefox.perftests.quarkus.data.entity822;

import fr.spacefox.perftests.quarkus.core.port.data.Entity822DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service822.model.Model822;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity822Repository implements Entity822DatasourcePort, PanacheRepository<Entity822> {
    @Override
    public Optional<Model822> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
