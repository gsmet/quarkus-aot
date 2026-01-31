package fr.spacefox.perftests.quarkus.data.entity737;

import fr.spacefox.perftests.quarkus.core.port.data.Entity737DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service737.model.Model737;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity737Repository implements Entity737DatasourcePort, PanacheRepository<Entity737> {
    @Override
    public Optional<Model737> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
