package fr.spacefox.perftests.quarkus.data.entity700;

import fr.spacefox.perftests.quarkus.core.port.data.Entity700DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service700.model.Model700;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity700Repository implements Entity700DatasourcePort, PanacheRepository<Entity700> {
    @Override
    public Optional<Model700> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
