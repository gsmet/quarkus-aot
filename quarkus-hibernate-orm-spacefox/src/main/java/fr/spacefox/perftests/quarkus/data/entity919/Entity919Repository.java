package fr.spacefox.perftests.quarkus.data.entity919;

import fr.spacefox.perftests.quarkus.core.port.data.Entity919DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service919.model.Model919;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity919Repository implements Entity919DatasourcePort, PanacheRepository<Entity919> {
    @Override
    public Optional<Model919> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
