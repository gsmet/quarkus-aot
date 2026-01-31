package fr.spacefox.perftests.quarkus.data.entity860;

import fr.spacefox.perftests.quarkus.core.port.data.Entity860DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service860.model.Model860;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity860Repository implements Entity860DatasourcePort, PanacheRepository<Entity860> {
    @Override
    public Optional<Model860> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
