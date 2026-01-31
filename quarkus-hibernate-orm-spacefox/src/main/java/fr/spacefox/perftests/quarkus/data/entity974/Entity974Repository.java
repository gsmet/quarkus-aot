package fr.spacefox.perftests.quarkus.data.entity974;

import fr.spacefox.perftests.quarkus.core.port.data.Entity974DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service974.model.Model974;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity974Repository implements Entity974DatasourcePort, PanacheRepository<Entity974> {
    @Override
    public Optional<Model974> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
