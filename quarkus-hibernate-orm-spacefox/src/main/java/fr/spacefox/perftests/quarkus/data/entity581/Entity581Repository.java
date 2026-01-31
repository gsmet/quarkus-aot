package fr.spacefox.perftests.quarkus.data.entity581;

import fr.spacefox.perftests.quarkus.core.port.data.Entity581DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service581.model.Model581;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity581Repository implements Entity581DatasourcePort, PanacheRepository<Entity581> {
    @Override
    public Optional<Model581> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
