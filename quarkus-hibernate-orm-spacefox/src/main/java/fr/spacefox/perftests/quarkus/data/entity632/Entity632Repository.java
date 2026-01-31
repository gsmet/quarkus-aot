package fr.spacefox.perftests.quarkus.data.entity632;

import fr.spacefox.perftests.quarkus.core.port.data.Entity632DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service632.model.Model632;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity632Repository implements Entity632DatasourcePort, PanacheRepository<Entity632> {
    @Override
    public Optional<Model632> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
