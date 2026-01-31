package fr.spacefox.perftests.quarkus.data.entity592;

import fr.spacefox.perftests.quarkus.core.port.data.Entity592DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service592.model.Model592;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity592Repository implements Entity592DatasourcePort, PanacheRepository<Entity592> {
    @Override
    public Optional<Model592> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
