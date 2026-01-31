package fr.spacefox.perftests.quarkus.data.entity687;

import fr.spacefox.perftests.quarkus.core.port.data.Entity687DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service687.model.Model687;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity687Repository implements Entity687DatasourcePort, PanacheRepository<Entity687> {
    @Override
    public Optional<Model687> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
