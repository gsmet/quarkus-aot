package fr.spacefox.perftests.quarkus.data.entity718;

import fr.spacefox.perftests.quarkus.core.port.data.Entity718DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service718.model.Model718;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity718Repository implements Entity718DatasourcePort, PanacheRepository<Entity718> {
    @Override
    public Optional<Model718> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
