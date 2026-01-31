package fr.spacefox.perftests.quarkus.data.entity459;

import fr.spacefox.perftests.quarkus.core.port.data.Entity459DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service459.model.Model459;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity459Repository implements Entity459DatasourcePort, PanacheRepository<Entity459> {
    @Override
    public Optional<Model459> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
