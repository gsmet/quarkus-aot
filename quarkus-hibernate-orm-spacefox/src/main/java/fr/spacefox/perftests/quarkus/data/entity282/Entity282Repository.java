package fr.spacefox.perftests.quarkus.data.entity282;

import fr.spacefox.perftests.quarkus.core.port.data.Entity282DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service282.model.Model282;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity282Repository implements Entity282DatasourcePort, PanacheRepository<Entity282> {
    @Override
    public Optional<Model282> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
