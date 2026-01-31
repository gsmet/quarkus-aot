package fr.spacefox.perftests.quarkus.data.entity403;

import fr.spacefox.perftests.quarkus.core.port.data.Entity403DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service403.model.Model403;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity403Repository implements Entity403DatasourcePort, PanacheRepository<Entity403> {
    @Override
    public Optional<Model403> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
