package fr.spacefox.perftests.quarkus.data.entity634;

import fr.spacefox.perftests.quarkus.core.port.data.Entity634DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service634.model.Model634;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity634Repository implements Entity634DatasourcePort, PanacheRepository<Entity634> {
    @Override
    public Optional<Model634> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
