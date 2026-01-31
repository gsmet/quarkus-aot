package fr.spacefox.perftests.quarkus.data.entity589;

import fr.spacefox.perftests.quarkus.core.port.data.Entity589DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service589.model.Model589;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity589Repository implements Entity589DatasourcePort, PanacheRepository<Entity589> {
    @Override
    public Optional<Model589> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
