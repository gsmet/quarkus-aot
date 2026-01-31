package fr.spacefox.perftests.quarkus.data.entity296;

import fr.spacefox.perftests.quarkus.core.port.data.Entity296DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service296.model.Model296;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity296Repository implements Entity296DatasourcePort, PanacheRepository<Entity296> {
    @Override
    public Optional<Model296> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
