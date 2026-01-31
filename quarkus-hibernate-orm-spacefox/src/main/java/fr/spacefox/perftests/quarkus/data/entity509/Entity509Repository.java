package fr.spacefox.perftests.quarkus.data.entity509;

import fr.spacefox.perftests.quarkus.core.port.data.Entity509DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service509.model.Model509;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity509Repository implements Entity509DatasourcePort, PanacheRepository<Entity509> {
    @Override
    public Optional<Model509> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
