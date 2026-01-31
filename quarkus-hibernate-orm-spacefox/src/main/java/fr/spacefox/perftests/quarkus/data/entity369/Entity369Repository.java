package fr.spacefox.perftests.quarkus.data.entity369;

import fr.spacefox.perftests.quarkus.core.port.data.Entity369DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service369.model.Model369;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity369Repository implements Entity369DatasourcePort, PanacheRepository<Entity369> {
    @Override
    public Optional<Model369> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
