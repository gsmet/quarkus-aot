package fr.spacefox.perftests.quarkus.data.entity697;

import fr.spacefox.perftests.quarkus.core.port.data.Entity697DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service697.model.Model697;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity697Repository implements Entity697DatasourcePort, PanacheRepository<Entity697> {
    @Override
    public Optional<Model697> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
