package fr.spacefox.perftests.quarkus.data.entity287;

import fr.spacefox.perftests.quarkus.core.port.data.Entity287DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service287.model.Model287;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity287Repository implements Entity287DatasourcePort, PanacheRepository<Entity287> {
    @Override
    public Optional<Model287> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
