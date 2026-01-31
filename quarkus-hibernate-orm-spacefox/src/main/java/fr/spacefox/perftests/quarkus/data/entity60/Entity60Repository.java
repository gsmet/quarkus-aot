package fr.spacefox.perftests.quarkus.data.entity60;

import fr.spacefox.perftests.quarkus.core.port.data.Entity60DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service60.model.Model60;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity60Repository implements Entity60DatasourcePort, PanacheRepository<Entity60> {
    @Override
    public Optional<Model60> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
