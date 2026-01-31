package fr.spacefox.perftests.quarkus.data.entity853;

import fr.spacefox.perftests.quarkus.core.port.data.Entity853DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service853.model.Model853;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity853Repository implements Entity853DatasourcePort, PanacheRepository<Entity853> {
    @Override
    public Optional<Model853> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
