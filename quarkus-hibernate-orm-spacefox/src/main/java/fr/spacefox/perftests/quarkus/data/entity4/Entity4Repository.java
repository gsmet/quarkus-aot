package fr.spacefox.perftests.quarkus.data.entity4;

import fr.spacefox.perftests.quarkus.core.port.data.Entity4DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service4.model.Model4;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity4Repository implements Entity4DatasourcePort, PanacheRepository<Entity4> {
    @Override
    public Optional<Model4> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
