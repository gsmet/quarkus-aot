package fr.spacefox.perftests.quarkus.data.entity546;

import fr.spacefox.perftests.quarkus.core.port.data.Entity546DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service546.model.Model546;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity546Repository implements Entity546DatasourcePort, PanacheRepository<Entity546> {
    @Override
    public Optional<Model546> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
