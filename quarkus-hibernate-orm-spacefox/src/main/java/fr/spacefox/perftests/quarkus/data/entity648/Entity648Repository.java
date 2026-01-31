package fr.spacefox.perftests.quarkus.data.entity648;

import fr.spacefox.perftests.quarkus.core.port.data.Entity648DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service648.model.Model648;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity648Repository implements Entity648DatasourcePort, PanacheRepository<Entity648> {
    @Override
    public Optional<Model648> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
