package fr.spacefox.perftests.quarkus.data.entity399;

import fr.spacefox.perftests.quarkus.core.port.data.Entity399DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service399.model.Model399;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity399Repository implements Entity399DatasourcePort, PanacheRepository<Entity399> {
    @Override
    public Optional<Model399> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
