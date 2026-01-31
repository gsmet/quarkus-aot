package fr.spacefox.perftests.quarkus.data.entity794;

import fr.spacefox.perftests.quarkus.core.port.data.Entity794DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service794.model.Model794;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity794Repository implements Entity794DatasourcePort, PanacheRepository<Entity794> {
    @Override
    public Optional<Model794> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
