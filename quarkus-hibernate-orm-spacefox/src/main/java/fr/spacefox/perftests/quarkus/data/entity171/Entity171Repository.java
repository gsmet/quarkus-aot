package fr.spacefox.perftests.quarkus.data.entity171;

import fr.spacefox.perftests.quarkus.core.port.data.Entity171DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service171.model.Model171;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity171Repository implements Entity171DatasourcePort, PanacheRepository<Entity171> {
    @Override
    public Optional<Model171> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
