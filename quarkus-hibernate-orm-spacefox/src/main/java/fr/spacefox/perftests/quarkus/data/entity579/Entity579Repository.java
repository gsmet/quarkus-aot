package fr.spacefox.perftests.quarkus.data.entity579;

import fr.spacefox.perftests.quarkus.core.port.data.Entity579DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service579.model.Model579;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity579Repository implements Entity579DatasourcePort, PanacheRepository<Entity579> {
    @Override
    public Optional<Model579> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
