package fr.spacefox.perftests.quarkus.data.entity248;

import fr.spacefox.perftests.quarkus.core.port.data.Entity248DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service248.model.Model248;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity248Repository implements Entity248DatasourcePort, PanacheRepository<Entity248> {
    @Override
    public Optional<Model248> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
