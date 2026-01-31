package fr.spacefox.perftests.quarkus.data.entity384;

import fr.spacefox.perftests.quarkus.core.port.data.Entity384DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service384.model.Model384;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity384Repository implements Entity384DatasourcePort, PanacheRepository<Entity384> {
    @Override
    public Optional<Model384> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
