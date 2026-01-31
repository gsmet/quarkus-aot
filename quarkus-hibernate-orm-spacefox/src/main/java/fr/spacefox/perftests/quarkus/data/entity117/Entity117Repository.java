package fr.spacefox.perftests.quarkus.data.entity117;

import fr.spacefox.perftests.quarkus.core.port.data.Entity117DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service117.model.Model117;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity117Repository implements Entity117DatasourcePort, PanacheRepository<Entity117> {
    @Override
    public Optional<Model117> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
