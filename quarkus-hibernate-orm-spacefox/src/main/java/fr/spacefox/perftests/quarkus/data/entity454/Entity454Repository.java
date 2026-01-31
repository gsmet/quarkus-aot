package fr.spacefox.perftests.quarkus.data.entity454;

import fr.spacefox.perftests.quarkus.core.port.data.Entity454DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service454.model.Model454;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity454Repository implements Entity454DatasourcePort, PanacheRepository<Entity454> {
    @Override
    public Optional<Model454> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
