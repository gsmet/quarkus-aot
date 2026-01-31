package fr.spacefox.perftests.quarkus.data.entity458;

import fr.spacefox.perftests.quarkus.core.port.data.Entity458DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service458.model.Model458;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity458Repository implements Entity458DatasourcePort, PanacheRepository<Entity458> {
    @Override
    public Optional<Model458> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
