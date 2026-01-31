package fr.spacefox.perftests.quarkus.data.entity482;

import fr.spacefox.perftests.quarkus.core.port.data.Entity482DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service482.model.Model482;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity482Repository implements Entity482DatasourcePort, PanacheRepository<Entity482> {
    @Override
    public Optional<Model482> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
