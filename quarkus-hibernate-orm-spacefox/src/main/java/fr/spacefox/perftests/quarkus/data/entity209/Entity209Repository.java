package fr.spacefox.perftests.quarkus.data.entity209;

import fr.spacefox.perftests.quarkus.core.port.data.Entity209DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service209.model.Model209;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity209Repository implements Entity209DatasourcePort, PanacheRepository<Entity209> {
    @Override
    public Optional<Model209> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
