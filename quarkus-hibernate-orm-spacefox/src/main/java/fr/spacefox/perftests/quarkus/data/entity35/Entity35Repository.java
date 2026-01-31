package fr.spacefox.perftests.quarkus.data.entity35;

import fr.spacefox.perftests.quarkus.core.port.data.Entity35DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service35.model.Model35;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity35Repository implements Entity35DatasourcePort, PanacheRepository<Entity35> {
    @Override
    public Optional<Model35> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
