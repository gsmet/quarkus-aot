package fr.spacefox.perftests.quarkus.data.entity529;

import fr.spacefox.perftests.quarkus.core.port.data.Entity529DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service529.model.Model529;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity529Repository implements Entity529DatasourcePort, PanacheRepository<Entity529> {
    @Override
    public Optional<Model529> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
