package fr.spacefox.perftests.quarkus.data.entity508;

import fr.spacefox.perftests.quarkus.core.port.data.Entity508DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service508.model.Model508;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity508Repository implements Entity508DatasourcePort, PanacheRepository<Entity508> {
    @Override
    public Optional<Model508> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
