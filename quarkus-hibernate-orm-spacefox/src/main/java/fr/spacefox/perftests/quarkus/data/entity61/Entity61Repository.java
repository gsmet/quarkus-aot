package fr.spacefox.perftests.quarkus.data.entity61;

import fr.spacefox.perftests.quarkus.core.port.data.Entity61DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service61.model.Model61;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity61Repository implements Entity61DatasourcePort, PanacheRepository<Entity61> {
    @Override
    public Optional<Model61> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
