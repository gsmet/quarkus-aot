package fr.spacefox.perftests.quarkus.data.entity466;

import fr.spacefox.perftests.quarkus.core.port.data.Entity466DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service466.model.Model466;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity466Repository implements Entity466DatasourcePort, PanacheRepository<Entity466> {
    @Override
    public Optional<Model466> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
