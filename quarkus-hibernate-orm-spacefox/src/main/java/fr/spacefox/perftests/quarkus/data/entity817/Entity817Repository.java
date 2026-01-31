package fr.spacefox.perftests.quarkus.data.entity817;

import fr.spacefox.perftests.quarkus.core.port.data.Entity817DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service817.model.Model817;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity817Repository implements Entity817DatasourcePort, PanacheRepository<Entity817> {
    @Override
    public Optional<Model817> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
