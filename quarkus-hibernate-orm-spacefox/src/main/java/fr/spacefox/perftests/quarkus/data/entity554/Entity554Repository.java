package fr.spacefox.perftests.quarkus.data.entity554;

import fr.spacefox.perftests.quarkus.core.port.data.Entity554DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service554.model.Model554;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity554Repository implements Entity554DatasourcePort, PanacheRepository<Entity554> {
    @Override
    public Optional<Model554> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
