package fr.spacefox.perftests.quarkus.data.entity40;

import fr.spacefox.perftests.quarkus.core.port.data.Entity40DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service40.model.Model40;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity40Repository implements Entity40DatasourcePort, PanacheRepository<Entity40> {
    @Override
    public Optional<Model40> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
