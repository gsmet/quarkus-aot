package fr.spacefox.perftests.quarkus.data.entity23;

import fr.spacefox.perftests.quarkus.core.port.data.Entity23DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service23.model.Model23;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity23Repository implements Entity23DatasourcePort, PanacheRepository<Entity23> {
    @Override
    public Optional<Model23> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
