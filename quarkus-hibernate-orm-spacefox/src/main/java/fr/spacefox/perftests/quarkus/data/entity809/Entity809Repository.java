package fr.spacefox.perftests.quarkus.data.entity809;

import fr.spacefox.perftests.quarkus.core.port.data.Entity809DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service809.model.Model809;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity809Repository implements Entity809DatasourcePort, PanacheRepository<Entity809> {
    @Override
    public Optional<Model809> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
