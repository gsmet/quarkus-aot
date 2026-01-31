package fr.spacefox.perftests.quarkus.data.entity261;

import fr.spacefox.perftests.quarkus.core.port.data.Entity261DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service261.model.Model261;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity261Repository implements Entity261DatasourcePort, PanacheRepository<Entity261> {
    @Override
    public Optional<Model261> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
