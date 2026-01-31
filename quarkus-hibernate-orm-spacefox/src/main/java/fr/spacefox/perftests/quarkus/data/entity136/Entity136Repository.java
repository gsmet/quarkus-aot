package fr.spacefox.perftests.quarkus.data.entity136;

import fr.spacefox.perftests.quarkus.core.port.data.Entity136DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service136.model.Model136;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity136Repository implements Entity136DatasourcePort, PanacheRepository<Entity136> {
    @Override
    public Optional<Model136> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
