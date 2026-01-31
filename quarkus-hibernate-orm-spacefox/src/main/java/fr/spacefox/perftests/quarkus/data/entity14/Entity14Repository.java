package fr.spacefox.perftests.quarkus.data.entity14;

import fr.spacefox.perftests.quarkus.core.port.data.Entity14DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service14.model.Model14;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity14Repository implements Entity14DatasourcePort, PanacheRepository<Entity14> {
    @Override
    public Optional<Model14> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
