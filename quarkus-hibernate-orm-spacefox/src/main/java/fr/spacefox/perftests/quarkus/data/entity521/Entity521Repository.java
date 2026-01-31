package fr.spacefox.perftests.quarkus.data.entity521;

import fr.spacefox.perftests.quarkus.core.port.data.Entity521DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service521.model.Model521;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity521Repository implements Entity521DatasourcePort, PanacheRepository<Entity521> {
    @Override
    public Optional<Model521> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
