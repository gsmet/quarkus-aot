package fr.spacefox.perftests.quarkus.data.entity681;

import fr.spacefox.perftests.quarkus.core.port.data.Entity681DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service681.model.Model681;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity681Repository implements Entity681DatasourcePort, PanacheRepository<Entity681> {
    @Override
    public Optional<Model681> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
