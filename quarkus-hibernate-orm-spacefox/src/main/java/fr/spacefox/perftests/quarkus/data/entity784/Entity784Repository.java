package fr.spacefox.perftests.quarkus.data.entity784;

import fr.spacefox.perftests.quarkus.core.port.data.Entity784DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service784.model.Model784;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity784Repository implements Entity784DatasourcePort, PanacheRepository<Entity784> {
    @Override
    public Optional<Model784> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
