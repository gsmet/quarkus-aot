package fr.spacefox.perftests.quarkus.data.entity110;

import fr.spacefox.perftests.quarkus.core.port.data.Entity110DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service110.model.Model110;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity110Repository implements Entity110DatasourcePort, PanacheRepository<Entity110> {
    @Override
    public Optional<Model110> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
