package fr.spacefox.perftests.quarkus.data.entity556;

import fr.spacefox.perftests.quarkus.core.port.data.Entity556DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service556.model.Model556;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity556Repository implements Entity556DatasourcePort, PanacheRepository<Entity556> {
    @Override
    public Optional<Model556> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
