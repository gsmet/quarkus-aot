package fr.spacefox.perftests.quarkus.data.entity953;

import fr.spacefox.perftests.quarkus.core.port.data.Entity953DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service953.model.Model953;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity953Repository implements Entity953DatasourcePort, PanacheRepository<Entity953> {
    @Override
    public Optional<Model953> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
