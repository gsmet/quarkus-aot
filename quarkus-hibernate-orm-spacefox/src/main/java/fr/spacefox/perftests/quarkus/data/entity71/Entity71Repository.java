package fr.spacefox.perftests.quarkus.data.entity71;

import fr.spacefox.perftests.quarkus.core.port.data.Entity71DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service71.model.Model71;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity71Repository implements Entity71DatasourcePort, PanacheRepository<Entity71> {
    @Override
    public Optional<Model71> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
