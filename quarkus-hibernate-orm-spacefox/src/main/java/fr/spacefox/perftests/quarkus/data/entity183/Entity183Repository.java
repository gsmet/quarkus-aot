package fr.spacefox.perftests.quarkus.data.entity183;

import fr.spacefox.perftests.quarkus.core.port.data.Entity183DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service183.model.Model183;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity183Repository implements Entity183DatasourcePort, PanacheRepository<Entity183> {
    @Override
    public Optional<Model183> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
