package fr.spacefox.perftests.quarkus.data.entity715;

import fr.spacefox.perftests.quarkus.core.port.data.Entity715DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service715.model.Model715;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity715Repository implements Entity715DatasourcePort, PanacheRepository<Entity715> {
    @Override
    public Optional<Model715> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
