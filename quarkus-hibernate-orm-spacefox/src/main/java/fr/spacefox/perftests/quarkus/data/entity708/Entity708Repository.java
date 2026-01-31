package fr.spacefox.perftests.quarkus.data.entity708;

import fr.spacefox.perftests.quarkus.core.port.data.Entity708DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service708.model.Model708;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity708Repository implements Entity708DatasourcePort, PanacheRepository<Entity708> {
    @Override
    public Optional<Model708> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
