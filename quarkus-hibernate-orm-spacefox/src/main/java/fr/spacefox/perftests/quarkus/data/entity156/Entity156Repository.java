package fr.spacefox.perftests.quarkus.data.entity156;

import fr.spacefox.perftests.quarkus.core.port.data.Entity156DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service156.model.Model156;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity156Repository implements Entity156DatasourcePort, PanacheRepository<Entity156> {
    @Override
    public Optional<Model156> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
