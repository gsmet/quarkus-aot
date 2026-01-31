package fr.spacefox.perftests.quarkus.data.entity343;

import fr.spacefox.perftests.quarkus.core.port.data.Entity343DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service343.model.Model343;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity343Repository implements Entity343DatasourcePort, PanacheRepository<Entity343> {
    @Override
    public Optional<Model343> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
