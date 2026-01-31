package fr.spacefox.perftests.quarkus.data.entity473;

import fr.spacefox.perftests.quarkus.core.port.data.Entity473DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service473.model.Model473;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity473Repository implements Entity473DatasourcePort, PanacheRepository<Entity473> {
    @Override
    public Optional<Model473> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
