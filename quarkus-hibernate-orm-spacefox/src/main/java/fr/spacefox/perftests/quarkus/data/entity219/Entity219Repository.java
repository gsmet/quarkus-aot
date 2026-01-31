package fr.spacefox.perftests.quarkus.data.entity219;

import fr.spacefox.perftests.quarkus.core.port.data.Entity219DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service219.model.Model219;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity219Repository implements Entity219DatasourcePort, PanacheRepository<Entity219> {
    @Override
    public Optional<Model219> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
