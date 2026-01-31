package fr.spacefox.perftests.quarkus.data.entity169;

import fr.spacefox.perftests.quarkus.core.port.data.Entity169DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service169.model.Model169;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity169Repository implements Entity169DatasourcePort, PanacheRepository<Entity169> {
    @Override
    public Optional<Model169> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
