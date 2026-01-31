package fr.spacefox.perftests.quarkus.data.entity606;

import fr.spacefox.perftests.quarkus.core.port.data.Entity606DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service606.model.Model606;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity606Repository implements Entity606DatasourcePort, PanacheRepository<Entity606> {
    @Override
    public Optional<Model606> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
