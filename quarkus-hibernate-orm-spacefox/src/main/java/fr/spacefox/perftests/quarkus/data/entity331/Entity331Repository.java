package fr.spacefox.perftests.quarkus.data.entity331;

import fr.spacefox.perftests.quarkus.core.port.data.Entity331DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service331.model.Model331;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity331Repository implements Entity331DatasourcePort, PanacheRepository<Entity331> {
    @Override
    public Optional<Model331> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
