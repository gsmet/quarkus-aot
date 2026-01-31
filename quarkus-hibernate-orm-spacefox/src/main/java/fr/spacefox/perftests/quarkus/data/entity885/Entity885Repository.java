package fr.spacefox.perftests.quarkus.data.entity885;

import fr.spacefox.perftests.quarkus.core.port.data.Entity885DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service885.model.Model885;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity885Repository implements Entity885DatasourcePort, PanacheRepository<Entity885> {
    @Override
    public Optional<Model885> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
