package fr.spacefox.perftests.quarkus.data.entity137;

import fr.spacefox.perftests.quarkus.core.port.data.Entity137DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service137.model.Model137;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity137Repository implements Entity137DatasourcePort, PanacheRepository<Entity137> {
    @Override
    public Optional<Model137> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
