package fr.spacefox.perftests.quarkus.data.entity316;

import fr.spacefox.perftests.quarkus.core.port.data.Entity316DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service316.model.Model316;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity316Repository implements Entity316DatasourcePort, PanacheRepository<Entity316> {
    @Override
    public Optional<Model316> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
