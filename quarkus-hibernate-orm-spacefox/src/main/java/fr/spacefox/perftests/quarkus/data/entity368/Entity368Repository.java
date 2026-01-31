package fr.spacefox.perftests.quarkus.data.entity368;

import fr.spacefox.perftests.quarkus.core.port.data.Entity368DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service368.model.Model368;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity368Repository implements Entity368DatasourcePort, PanacheRepository<Entity368> {
    @Override
    public Optional<Model368> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
