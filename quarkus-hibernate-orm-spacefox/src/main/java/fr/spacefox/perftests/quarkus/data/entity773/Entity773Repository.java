package fr.spacefox.perftests.quarkus.data.entity773;

import fr.spacefox.perftests.quarkus.core.port.data.Entity773DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service773.model.Model773;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity773Repository implements Entity773DatasourcePort, PanacheRepository<Entity773> {
    @Override
    public Optional<Model773> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
