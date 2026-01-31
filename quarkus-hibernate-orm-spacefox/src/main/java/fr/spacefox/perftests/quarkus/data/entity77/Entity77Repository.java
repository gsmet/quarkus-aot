package fr.spacefox.perftests.quarkus.data.entity77;

import fr.spacefox.perftests.quarkus.core.port.data.Entity77DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service77.model.Model77;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity77Repository implements Entity77DatasourcePort, PanacheRepository<Entity77> {
    @Override
    public Optional<Model77> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
