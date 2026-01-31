package fr.spacefox.perftests.quarkus.data.entity871;

import fr.spacefox.perftests.quarkus.core.port.data.Entity871DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service871.model.Model871;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity871Repository implements Entity871DatasourcePort, PanacheRepository<Entity871> {
    @Override
    public Optional<Model871> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
