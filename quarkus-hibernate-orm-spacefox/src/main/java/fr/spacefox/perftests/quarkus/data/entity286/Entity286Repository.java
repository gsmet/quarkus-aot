package fr.spacefox.perftests.quarkus.data.entity286;

import fr.spacefox.perftests.quarkus.core.port.data.Entity286DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service286.model.Model286;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity286Repository implements Entity286DatasourcePort, PanacheRepository<Entity286> {
    @Override
    public Optional<Model286> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
