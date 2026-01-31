package fr.spacefox.perftests.quarkus.data.entity874;

import fr.spacefox.perftests.quarkus.core.port.data.Entity874DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service874.model.Model874;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity874Repository implements Entity874DatasourcePort, PanacheRepository<Entity874> {
    @Override
    public Optional<Model874> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
