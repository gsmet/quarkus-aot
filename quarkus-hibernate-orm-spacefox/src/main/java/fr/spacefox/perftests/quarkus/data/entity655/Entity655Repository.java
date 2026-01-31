package fr.spacefox.perftests.quarkus.data.entity655;

import fr.spacefox.perftests.quarkus.core.port.data.Entity655DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service655.model.Model655;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity655Repository implements Entity655DatasourcePort, PanacheRepository<Entity655> {
    @Override
    public Optional<Model655> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
