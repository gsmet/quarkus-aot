package fr.spacefox.perftests.quarkus.data.entity666;

import fr.spacefox.perftests.quarkus.core.port.data.Entity666DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service666.model.Model666;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity666Repository implements Entity666DatasourcePort, PanacheRepository<Entity666> {
    @Override
    public Optional<Model666> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
