package fr.spacefox.perftests.quarkus.data.entity927;

import fr.spacefox.perftests.quarkus.core.port.data.Entity927DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service927.model.Model927;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity927Repository implements Entity927DatasourcePort, PanacheRepository<Entity927> {
    @Override
    public Optional<Model927> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
