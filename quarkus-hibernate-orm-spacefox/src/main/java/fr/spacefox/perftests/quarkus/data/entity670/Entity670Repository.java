package fr.spacefox.perftests.quarkus.data.entity670;

import fr.spacefox.perftests.quarkus.core.port.data.Entity670DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service670.model.Model670;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity670Repository implements Entity670DatasourcePort, PanacheRepository<Entity670> {
    @Override
    public Optional<Model670> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
