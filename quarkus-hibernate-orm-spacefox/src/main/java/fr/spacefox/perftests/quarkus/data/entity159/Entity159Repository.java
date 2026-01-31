package fr.spacefox.perftests.quarkus.data.entity159;

import fr.spacefox.perftests.quarkus.core.port.data.Entity159DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service159.model.Model159;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity159Repository implements Entity159DatasourcePort, PanacheRepository<Entity159> {
    @Override
    public Optional<Model159> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
