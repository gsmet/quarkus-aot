package fr.spacefox.perftests.quarkus.data.entity423;

import fr.spacefox.perftests.quarkus.core.port.data.Entity423DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service423.model.Model423;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity423Repository implements Entity423DatasourcePort, PanacheRepository<Entity423> {
    @Override
    public Optional<Model423> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
