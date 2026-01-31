package fr.spacefox.perftests.quarkus.data.entity320;

import fr.spacefox.perftests.quarkus.core.port.data.Entity320DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service320.model.Model320;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity320Repository implements Entity320DatasourcePort, PanacheRepository<Entity320> {
    @Override
    public Optional<Model320> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
