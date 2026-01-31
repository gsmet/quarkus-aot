package fr.spacefox.perftests.quarkus.data.entity563;

import fr.spacefox.perftests.quarkus.core.port.data.Entity563DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service563.model.Model563;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity563Repository implements Entity563DatasourcePort, PanacheRepository<Entity563> {
    @Override
    public Optional<Model563> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
