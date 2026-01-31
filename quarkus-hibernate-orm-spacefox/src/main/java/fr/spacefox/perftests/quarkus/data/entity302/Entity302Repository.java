package fr.spacefox.perftests.quarkus.data.entity302;

import fr.spacefox.perftests.quarkus.core.port.data.Entity302DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service302.model.Model302;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity302Repository implements Entity302DatasourcePort, PanacheRepository<Entity302> {
    @Override
    public Optional<Model302> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
