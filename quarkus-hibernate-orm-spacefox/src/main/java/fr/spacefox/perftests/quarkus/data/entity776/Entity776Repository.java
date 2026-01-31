package fr.spacefox.perftests.quarkus.data.entity776;

import fr.spacefox.perftests.quarkus.core.port.data.Entity776DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service776.model.Model776;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity776Repository implements Entity776DatasourcePort, PanacheRepository<Entity776> {
    @Override
    public Optional<Model776> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
