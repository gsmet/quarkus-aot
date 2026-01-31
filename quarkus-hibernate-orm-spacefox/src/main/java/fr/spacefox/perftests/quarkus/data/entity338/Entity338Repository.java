package fr.spacefox.perftests.quarkus.data.entity338;

import fr.spacefox.perftests.quarkus.core.port.data.Entity338DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service338.model.Model338;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity338Repository implements Entity338DatasourcePort, PanacheRepository<Entity338> {
    @Override
    public Optional<Model338> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
