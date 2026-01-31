package fr.spacefox.perftests.quarkus.data.entity290;

import fr.spacefox.perftests.quarkus.core.port.data.Entity290DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service290.model.Model290;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity290Repository implements Entity290DatasourcePort, PanacheRepository<Entity290> {
    @Override
    public Optional<Model290> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
