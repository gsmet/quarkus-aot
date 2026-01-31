package fr.spacefox.perftests.quarkus.data.entity439;

import fr.spacefox.perftests.quarkus.core.port.data.Entity439DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service439.model.Model439;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity439Repository implements Entity439DatasourcePort, PanacheRepository<Entity439> {
    @Override
    public Optional<Model439> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
