package fr.spacefox.perftests.quarkus.data.entity593;

import fr.spacefox.perftests.quarkus.core.port.data.Entity593DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service593.model.Model593;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity593Repository implements Entity593DatasourcePort, PanacheRepository<Entity593> {
    @Override
    public Optional<Model593> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
