package fr.spacefox.perftests.quarkus.data.entity366;

import fr.spacefox.perftests.quarkus.core.port.data.Entity366DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service366.model.Model366;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity366Repository implements Entity366DatasourcePort, PanacheRepository<Entity366> {
    @Override
    public Optional<Model366> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
