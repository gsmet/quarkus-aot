package fr.spacefox.perftests.quarkus.data.entity856;

import fr.spacefox.perftests.quarkus.core.port.data.Entity856DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service856.model.Model856;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity856Repository implements Entity856DatasourcePort, PanacheRepository<Entity856> {
    @Override
    public Optional<Model856> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
