package fr.spacefox.perftests.quarkus.data.entity311;

import fr.spacefox.perftests.quarkus.core.port.data.Entity311DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service311.model.Model311;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity311Repository implements Entity311DatasourcePort, PanacheRepository<Entity311> {
    @Override
    public Optional<Model311> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
