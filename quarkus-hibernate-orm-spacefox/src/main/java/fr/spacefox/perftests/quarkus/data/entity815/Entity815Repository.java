package fr.spacefox.perftests.quarkus.data.entity815;

import fr.spacefox.perftests.quarkus.core.port.data.Entity815DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service815.model.Model815;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity815Repository implements Entity815DatasourcePort, PanacheRepository<Entity815> {
    @Override
    public Optional<Model815> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
