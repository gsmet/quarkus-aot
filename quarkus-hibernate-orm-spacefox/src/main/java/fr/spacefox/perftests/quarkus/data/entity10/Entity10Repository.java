package fr.spacefox.perftests.quarkus.data.entity10;

import fr.spacefox.perftests.quarkus.core.port.data.Entity10DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service10.model.Model10;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity10Repository implements Entity10DatasourcePort, PanacheRepository<Entity10> {
    @Override
    public Optional<Model10> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
