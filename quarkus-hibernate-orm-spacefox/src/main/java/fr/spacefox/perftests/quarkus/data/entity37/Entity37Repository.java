package fr.spacefox.perftests.quarkus.data.entity37;

import fr.spacefox.perftests.quarkus.core.port.data.Entity37DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service37.model.Model37;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity37Repository implements Entity37DatasourcePort, PanacheRepository<Entity37> {
    @Override
    public Optional<Model37> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
